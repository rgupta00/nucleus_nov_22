package com.customerapp.web.controller;

import com.customerapp.dao.user.User;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        User user=new User("keshav","keshav123","emp");
        userService.addUser(user);

//        System.out.println(user);
//        CustomerService customerService=new CustomerServiceImpl();
//        customerService.deleteCustomer(7);
        //String name, String address, String mobile, String email
//        Customer customer=customerService.getById(7);
//        customer.setAddress("NY");
//        customer.setEmail("p1@gmail.com");
//        customerService.updateCustomer(7, customer);
       // System.out.println(customer);
      //  Customer customer=new Customer("pooja","delhi","88888000","p@gmail.com");

//        customerService.addCustomer(customer);
//        List<Customer> customers=customerService.getAll();
//        customers.forEach(c-> System.out.println(c));
    }
}
