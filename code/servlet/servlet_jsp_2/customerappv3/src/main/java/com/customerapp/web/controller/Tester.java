package com.customerapp.web.controller;

import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.user.User;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

import java.util.List;
//
public class Tester {
    public static void main(String[] args) {
//        UserService userService=new UserServiceImpl();
//        User user=userService.getUser("jkljklkj","raj123");
//        System.out.println(user);

        CustomerService customerService=new CustomerServiceImpl();

        Customer c=customerService.addCustomer(new Customer("geeta","delhi",
                "55666666","geeta@gmail.com"));

        System.out.println(c);

//        customerService.addCustomer(new Customer("sumit","banglore",
//                "55660666","sumit@gmail.com"));

    }
}
