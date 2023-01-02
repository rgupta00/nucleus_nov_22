package com.customerapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;

@Controller
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
   
    @GetMapping(path ="showall")
    public ModelAndView showAllCustomer(ModelAndView mv){
        mv.addObject("customersList", customerService.getAll());
        mv.setViewName("show");
        return  mv;
    }
    
    //--------------delete ------------------
    @GetMapping(path ="delete")
    public String deleteCustomer(HttpServletRequest request){
       Integer id=Integer.parseInt(request.getParameter("id"));
       customerService.deleteCustomer(id);
        return  "redirect:showall";
    }
    
    //--------------add customer ------------------
    @GetMapping(path ="addcustomer")
    public String addCustomerGet(ModelMap map){
       Customer customer=new Customer();
       map.addAttribute("customer", customer);
        return  "addcustomer";
    }
    
    @PostMapping(path ="addcustomer")
    public String addCustomerPost( @ModelAttribute(name="customer") Customer customer){
    	int id=customer.getId();
    	if(id==0) {
    		customerService.addCustomer(customer);
    	}else {
    		customerService.updateCustomer(id, customer);
    	}
    	
    	 return  "redirect:showall";
    }
    
    
  //--------------update customer ------------------
    @GetMapping(path ="update")
    public String updateCustomer(HttpServletRequest request,  ModelMap map){
       Integer id=Integer.parseInt(request.getParameter("id"));
       Customer customer=customerService.getById(id);
       map.addAttribute("customer", customer);
        return  "updatecustomer";
    }
    
}









