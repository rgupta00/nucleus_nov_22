package com.productapp.web.controller;

import com.productapp.model.dao.entities.Category;
import com.productapp.model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String home(){
        return "redirect:showall";
    }

    //--------showall products-------
    @GetMapping("showall")
    public String getAll(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryService.getAllCategories());
        return "showall";
    }

    //delete
    //--------delete-------
    @GetMapping("delete")
    public String deleteCategory(@RequestParam(name = "cid")int cid){
        categoryService.deleteCategory(cid);
        return "redirect:showall";
    }


    //--------update-------
    @GetMapping("update")
    public String updateCategory(@RequestParam(name = "cid")int cid, ModelMap modelMap){
        Category category=categoryService.getByCategoryId(cid);
        modelMap.addAttribute("category", category);
        return "addcategory";
    }

    //--------addcategory-------
    @GetMapping("addcategory")
    public String addCategoryGet(@ModelAttribute(name = "category") Category category){
        return "addcategory";
    }
    @PostMapping("addcategory")
    public String addCategoryPost(@ModelAttribute(name = "category") Category category){
        if(category.getCid()==null) {
            categoryService.addCategory(category);
        }else {
            categoryService.updateCategory(category);
        }
        return "redirect:showall";
    }


}
