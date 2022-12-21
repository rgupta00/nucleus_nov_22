package com.customerapp.service;

import com.customerapp.dao.customer.Customer;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public List<Customer> getAll();
}
