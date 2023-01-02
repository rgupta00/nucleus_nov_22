package com.customer.dao;
import com.customer.exception.DataAccessException;

import java.sql.SQLException;
import java.util.*;
public interface CustomerDao {
    public List<Customer> getAll();
    public void  addCustomer(Customer customer);
}
