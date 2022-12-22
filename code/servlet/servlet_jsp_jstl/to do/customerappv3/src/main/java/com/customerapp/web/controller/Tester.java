package com.customerapp.web.controller;

import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.user.User;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

public class Tester {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        User user=userService.getUser("raj","raj123ljlkj");
        System.out.println(user);
//        CustomerService customerService=new CustomerServiceImpl();
//        Customer customer=customerService.getById(14);
//        System.out.println(customer);
//        customer.setAddress("new add");
//        customer.setEmail("new email");
//        customer.setMobile("55555");
//        customerService.updateCustomer(11, customer);

    }
}
