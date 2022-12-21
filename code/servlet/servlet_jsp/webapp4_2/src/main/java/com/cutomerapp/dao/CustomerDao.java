package com.cutomerapp.dao;
import java.util.*;
public interface CustomerDao {
    public void addCustomer(Customer customer);
    public List<Customer> getAll();
}
