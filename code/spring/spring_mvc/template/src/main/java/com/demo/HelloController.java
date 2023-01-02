package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Back controller replacement of servetl
//hellourl?nane=raj&age=43
// requestparam vs pathvariable
@Controller
public class HelloController {

    //ModelAndView vs Model vs ModelMap
    @GetMapping("hellourl2")
    public void hello(ModelMap mv){
        mv.addAttribute("info","we all are champs using modelMap!");
    }

    @DeleteMapping("hellourl2")
    public String hello3(Model mv){
        mv.addAttribute("info","we all are champs using model!");
        return "index";
    }


//    @GetMapping("hellourl")
//    public ModelAndView hello(@RequestParam(name = "name")String name,
//                              @RequestParam(name="age") Integer age){
//        System.out.println(name);
//        System.out.println(age);
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("index");
//        mv.addObject("info","we all are champs!");
//        return mv;
//    }


//    @GetMapping("hellourl")
//    public ModelAndView hello(HttpServletRequest request){
//        String name=request.getParameter("name");
//        Integer age=Integer.parseInt(request.getParameter("age"));
//        System.out.println(name);
//        System.out.println(age);
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("index");
//        mv.addObject("info","we all are champs!");
//        return mv;
//    }

}
