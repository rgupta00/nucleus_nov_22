package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
    public String registerPost( @ModelAttribute(name = "user") User user, BindingResult result){
        if (result.hasErrors()) {
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
}
