package com.customerapp.controller;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
//@RequestMapping(path="customerapp")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    //show all the records
    //-------show all records----
    @GetMapping(path = "/")
    public String index(){
      return "redirect:addcustomer"  ;
    }
    //-------post an record----
    @GetMapping(path = "addcustomer")
    public String addCustomerGet(ModelMap modelMap){
        Customer customer=new Customer();//form bean
      //  customer.setAddress("banglore");
        modelMap.addAttribute("customer", customer);
        return "addcustomer";
    }


    @ModelAttribute(value="customertypes")
    public List<String> getCustomerType(){
        return List.of("SILVER","GOLD","DIAMOND");
    }

    @PostMapping(path = "addcustomer")
    public String addCustomerPost(@ModelAttribute(name = "customer")  Customer customer,
                                  RedirectAttributes redirectAttributes){
        System.out.println(customer);
        System.out.println("---------------------");
        System.out.println(customer.getId());
        System.out.println("---------------------");
        int id=customer.getId();
        if(id==0){
            customerService.addCustomer(customer);
        }else{
            customerService.updateCustomer(customer.getId(), customer);
        }
        redirectAttributes.addFlashAttribute("info","customer recored is added successfully!");
        return "redirect:success";
    }

    @ModelAttribute("customerTypes")
    public List<String> customertype()
    {
        return List.of("SILVER","GOLD","DIAMOND");
    }

    @ModelAttribute("javaFramworks")
    public List<String> javaFramworksList()
    {
        List<String> framework = Arrays.asList(
                "Spring", "Spring boot", "Hibernate",
                "microservice", "docker");
        return framework;
    }
//    @GetMapping(path = "success")
//    public String success(ModelMap modelMap){
//        System.out.println("---------------");
//        System.out.println(modelMap.getAttribute("info"));
//        System.out.println("---------------");
//        return "success";
//    }

}













