package com.empapp.dao;
import java.util.*;
//DAO
public interface EmployeeDao {
    public List<Employee> getAll();
    public Employee getEmployeeById(int id);
    public void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, Employee employee);

}
