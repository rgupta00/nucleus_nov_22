package com.customerapp.web.controller;

import com.customerapp.dao.customer.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

public class Tester {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerServiceImpl();
        Customer customer=customerService.getById(11);
        customer.setAddress("new add");
        customer.setEmail("new email");
        customer.setMobile("55555");
        customerService.updateCustomer(11, customer);

    }
}
