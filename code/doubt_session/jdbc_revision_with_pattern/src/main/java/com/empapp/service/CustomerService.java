package com.empapp.service;

import com.empapp.dao.Customer;

import java.util.List;

public interface CustomerService {
    public void populateData();
    public List<Customer> getAll();
    public void addEmployee(Customer employee);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, double salary);
    public void getById(int id);
}
