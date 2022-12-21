package com.empapp.dao;
import java.util.*;
public interface EmployeeDao {
    public List<Employee> getAll();
    public List<Employee> getAllWithProjets();
    public  void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void updateEmployee(int id, double salary);
    public Optional<Employee> findById(int id);
}
