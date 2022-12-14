package com.customerapp.controller;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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
    @GetMapping(path = "showall")
    public String showAll(ModelMap mv){
        List<Customer> customers=customerService.getAll();
        //customerList   ----> try this : aka shortcut: we dont have to give the key : mv.addAttribute(customerService.getAll());
        mv.addAttribute("customersList", customerService.getAll());
        return "show";
    }

    //-------delete an record----
    @GetMapping(path = "delete")
    public String deleteCustomer(@RequestParam(name="id") int id){
       customerService.deleteCustomer(id);
        return "redirect:showall";
    }

    //-------post an record----
    @GetMapping(path = "addcustomer")
    public String addCustomerGet(ModelMap modelMap){
        Customer customer=new Customer();//form bean
      //  customer.setAddress("banglore");
        modelMap.addAttribute("customer", customer);
        return "addcustomer";
    }

    @PostMapping(path = "addcustomer")
    public String addCustomerPost(@ModelAttribute(name = "customer")  Customer customer){
        int id=customer.getId();
        if(id==0){
            customerService.addCustomer(customer);
        }else{
            customerService.updateCustomer(customer.getId(), customer);
        }
        return "redirect:showall";
    }

    @ModelAttribute(value="customertypes")
    public List<String> getGender(){
        return List.of("GOLD","SILVER");
    }
    //updatecustomer.jsp
    @GetMapping(path = "update")
    public String udpateCustomerGet(ModelMap modelMap, @RequestParam(name="id") int id){
        modelMap.addAttribute("customer", customerService.getById(id));
        return "updatecustomer";
    }

}













