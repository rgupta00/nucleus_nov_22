package com.empapp.dao;
import java.util.*;
public interface CustomerDao {
    public void populateData();
    public List<Customer> getAll();
    public void addEmployee(Customer employee);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, double salary);
    public void getById(int id);
}
