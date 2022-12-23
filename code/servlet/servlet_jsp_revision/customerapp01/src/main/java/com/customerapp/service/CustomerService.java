package com.customerapp.service;

import com.customerapp.dao.customer.Customer;

import java.util.List;

public interface CustomerService {
    public void deleteCustomer(int id);
    public void updateCustomer(int id, Customer customer);
    public Customer getById(int id);
    public void addCustomer(Customer customer);
    public List<Customer> getAll();
}
