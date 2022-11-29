package com.bankapp.model.dao;
import com.bankapp.model.dto.Customer;

import java.util.*;
public interface CustomerDao {
    public void addCustomer(Customer customer);
    public void updateCustomer(int id, Customer customer);
    public Customer getCustomerById(int id);
    public void deleteCustomer(int id);
}
