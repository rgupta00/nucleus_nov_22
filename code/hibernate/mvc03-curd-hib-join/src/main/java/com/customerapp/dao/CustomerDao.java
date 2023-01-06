package com.customerapp.dao;

import com.customerapp.dao.entity.Customer;

import java.util.List;
public interface CustomerDao {
    public List<Customer> getAll();
    public void  addCustomer(Customer customer);
    public void deleteCustomer(int id);
    public void updateCustomer(int id, Customer customer);
    public Customer getById(int id);
}
