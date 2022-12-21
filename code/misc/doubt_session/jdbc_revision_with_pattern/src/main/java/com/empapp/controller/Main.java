package com.empapp.controller;
import java.util.*;

import com.empapp.dao.Customer;
import com.empapp.service.CustomerService;
import com.empapp.service.CustomerServiceImpl;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerServiceImpl();
        customerService.populateData();

        System.out.println("-------all records----------");
        List<Customer> customers=customerService.getAll();
        customers.forEach(e-> System.out.println(e));
//
//        Customer customer=new Customer("indu",7000);
//        customerService.addEmployee(customer);
//
//        System.out.println("---after adding -------");
//        customers=customerService.getAll();
//        customers.forEach(e-> System.out.println(e));
    }
}
