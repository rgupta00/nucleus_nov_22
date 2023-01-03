package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    //hellourl/noida
    @GetMapping("hellourl/{cityName}")
    public ModelAndView helloPathVariable(ModelAndView mv, @PathVariable(name="cityName") String city){
        System.out.println(city);
        mv.setViewName("index");
        mv.addObject("info","we all are champs!");
        return mv;
    }



    //how to pass parameters ?name=raj&age=47
    //@PathVariable vs @RequsetParam
    @GetMapping("hellourl")
    public ModelAndView hello(ModelAndView mv,  @RequestParam(name="name") String uname,
                              @RequestParam(name="age") int uage){
        System.out.println(uname);
        System.out.println(uage);
        mv.setViewName("index");
        mv.addObject("info","we all are champs!");
        return mv;
    }


//    @GetMapping("hellourl")
//    public ModelAndView hello(ModelAndView mv, HttpServletRequest request){
//        String name=request.getParameter("name");
//        Integer age=Integer.parseInt(request.getParameter("age"));
//        System.out.println(name);
//        System.out.println(age);
//        mv.setViewName("index");
//        mv.addObject("info","we all are champs!");
//        return mv;
//    }


//    @GetMapping("hellourl")
//    public String hello2(ModelMap mv){
//        //mv.addAttribute()
//        mv.addAttribute("info","we all are champs!");
//        return "index";
//    }

//    @GetMapping("hellourl")
//    public String hello2(Model mv){
//        mv.addAttribute("info","we all are champs!");
//        return "index";
//    }

//    @GetMapping("hellourl")
//    public ModelAndView hello(ModelAndView mv){
//        mv.setViewName("index");
//        mv.addObject("info","we all are champs!");
//        return mv;
//    }

}
