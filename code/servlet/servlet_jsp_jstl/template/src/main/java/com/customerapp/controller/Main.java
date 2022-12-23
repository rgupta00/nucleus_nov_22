package com.customerapp.controller;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerServiceImpl();
        customerService.deleteCustomer(7);
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
