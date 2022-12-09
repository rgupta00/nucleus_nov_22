package com.empapp.dao;
import  java.util.*;
public interface EmployeeDao {
    public List<Employee> getAll();
    public void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, double salary);
    public Employee findById(int id);
}
