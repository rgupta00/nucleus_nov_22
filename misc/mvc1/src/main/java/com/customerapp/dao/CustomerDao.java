package com.customerapp.dao;
import java.util.*;
public interface CustomerDao {
    public void deleteCustomer(int id);
    public void updateCustomer(int id, Customer customer);
    public Customer getById(int id);
    public List<Customer> getAll();
    public void addCustomer(Customer customer);

}
