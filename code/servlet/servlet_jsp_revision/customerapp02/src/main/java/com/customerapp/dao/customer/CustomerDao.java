package com.customerapp.dao.customer;
import java.util.*;
public interface CustomerDao {
    public void deleteCustomer(int id);
    public void updateCustomer(int id, Customer customer);
    public Customer getById(int id);
    public void addCustomer(Customer customer);
    public List<Customer> getAll();
}
