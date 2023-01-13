package com.customerapp.controller;

import com.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller
////@RequestMapping(path="customerapp")
//public class CustomerController {
//
//    private CustomerService customerService;
//
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//    //show all the records
//    @GetMapping(path = "showall")
//    public ModelAndView showAll(ModelAndView mv){
//        mv.addObject("customersList", customerService.getAll());
//        mv.setViewName("show");
//        return mv;
//    }
//
//}













