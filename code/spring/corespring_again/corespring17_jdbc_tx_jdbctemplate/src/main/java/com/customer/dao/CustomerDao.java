package com.customer.dao;
import com.customer.exception.DataAccessException;

import java.sql.SQLException;
import java.util.*;
public interface CustomerDao {
    public void deleteCustomer(int id);
    public Customer getById(int id);
    public void updateCustomer(int id, Customer customer);

    public List<Customer> getAll();
    public void  addCustomer(Customer customer);
}
