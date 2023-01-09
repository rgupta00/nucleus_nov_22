package com.demo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("register")
    public String registerGet(ModelMap modelMap){
        modelMap.addAttribute("user",new User());
        return "register";
    }
    @PostMapping("register")
    public String registerPost(@Valid @ModelAttribute(name = "user") User user, BindingResult result){
        System.out.println("|"+user.getUsername()+"|");
        if (result.hasErrors()) {
            List<ObjectError>  objectErrors=result.getAllErrors();
            for (ObjectError err: objectErrors){
                System.out.println(err);
            }
            return "register";
        }
        System.out.println("----------");
        System.out.println(user);
        System.out.println("----------");
        return "success";
    }
    @ModelAttribute(name="countries")
    public List<String> countrires(){
        return List.of("India","USA", "AUS");
    }

    @InitBinder
    public void init(WebDataBinder binder){
        //binder.setDisallowedFields("username");// i am asking spring init binder to skip username to capture from the form
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,"username",stringTrimmerEditor);
        System.out.println("-----inside init method---");
    }
}
