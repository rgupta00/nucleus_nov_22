package com.customerapp.service;

import com.customerapp.dao.Customer;

import java.util.List;
//BL?
public interface CustomerService {
    public void deleteCustomer(int id);
    public void updateCustomer(int id, Customer customer);
    public Customer getById(int id);
    public List<Customer> getAll();
    public void addCustomer(Customer customer);

}
