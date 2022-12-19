package com.customerapp.dao.customer;

import com.customerapp.dao.customer.Customer;

import java.util.List;

public interface CustomerDao {
    public Customer addCustomer(Customer customer);
    public List<Customer> getAll();
}
