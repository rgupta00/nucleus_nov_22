package com.empapp.service;

import com.empapp.dao.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();
    public void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, double salary);
    public Employee getById(int id);
}
