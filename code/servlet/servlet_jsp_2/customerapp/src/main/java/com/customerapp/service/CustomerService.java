package com.customerapp.service;

import com.customerapp.dao.Customer;

import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer customer);
    public List<Customer> getAll();
}
