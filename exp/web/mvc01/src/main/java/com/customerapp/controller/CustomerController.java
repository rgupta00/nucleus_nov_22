package com.customerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @GetMapping(path ="showall")
    public String showAllCustomer(ModelMap model){
        model.addAttribute("customersList", customerService.getAll());
	    return "show";
    }
    
    //--------------delete ------------------
    @GetMapping(path ="delete")
    public String deleteCustomer(@RequestParam(name="id") int id){
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
    public String updateCustomer(@RequestParam(name="id") int id,  ModelMap map){
       Customer customer=customerService.getById(id);
       map.addAttribute("customer", customer);
        return  "updatecustomer";
    }
    
}









