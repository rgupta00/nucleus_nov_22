package com.customerapp.controller;

import com.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(value="showall")
    public ModelAndView showAll(ModelAndView mv){
        System.out.println("----------------");
        mv.addObject("customersList", customerService.getAll());
        mv.setViewName("show");
        return  mv;
    }
}
