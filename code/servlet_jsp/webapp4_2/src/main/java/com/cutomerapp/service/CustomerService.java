package com.cutomerapp.service;

import com.cutomerapp.dao.Customer;

import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer customer);
    public List<Customer> getAll();
}
