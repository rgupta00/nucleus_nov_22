package com.customerapp.test;

import com.customerapp.dao.customer.Address;
import com.customerapp.dao.customer.Customer;
import com.customerapp.dao.user.User;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;
import com.customerapp.service.UserService;
import com.customerapp.service.UserServiceImpl;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        UserService userService=new UserServiceImpl();
//        User user=userService.getUser("ekta","ekta123",
//                "admin");
//        System.out.println(user);
        CustomerService customerService=new CustomerServiceImpl();

       Customer customer=customerService.getById(1);
        System.out.println(customer);
       customer.getAddress().setState("chennai");
       customerService.updateCustomer(1, customer);

//        System.out.println(customer);
//        List<Customer> customers=customerService.getAll();
//        for (Customer customer:customers){
//            System.out.println(customer);
//          //  System.out.println(customer.getAddress());
//        }
      //  Customer customer=customerService.getById(14);
//        System.out.println(customer);
//        customer.setAddress("new add");
//        customer.setEmail("new email");
//        customer.setMobile("55555");
//        customerService.updateCustomer(11, customer);

    }
}
