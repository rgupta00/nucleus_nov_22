package com.productapp.model.service;

import com.productapp.model.dao.CategoryDao;
import com.productapp.model.dao.entities.Category;
import com.productapp.model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service(value = "categoryService")
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao;

    @Autowired
    public CategoryServiceImpl(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryDao.getAllCategories();
    }

    @Override
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Override
    public void deleteCategory(int cid) {
        categoryDao.deleteCategory(cid);
    }

    @Override
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }

    @Override
    public Category getByCategoryId(int cid) {
        return categoryDao.getByCategoryId(cid);
    }

    @Override
    public Category getByCategoryType(String categoryType) {
        return categoryDao.getByCategoryType(categoryType);
    }
}
