package com.empapp.dao.impl;
import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.exceptions.EmployeeNotFoundException;

import java.util.*;
public class EmployeeDaoImplMap implements EmployeeDao {
    private Map<Integer, Employee> employeeMap=new LinkedHashMap<>();
    @Override
    public List<Employee> getAll() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee getEmployeeById(int id) {
         Employee employee=   employeeMap.get(id);
         if (employee==null)
             throw  new EmployeeNotFoundException("emp with id "+ id +" is not found");
         return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee=  getEmployeeById(id);
        employeeMap.remove(employee.getId());
    }


    @Override
    public void updateEmployee(int id, Employee employee) {
//        Employee employeeToUpdate=  getEmployeeById(id);
//        employeeToUpdate.setSalary(employee.getSalary());
//        employeeToUpdate.setEmail(employee.getEmail());
//        employeeToUpdate.setPhone(employee.getPhone());
        employeeMap.put(id, employee);
    }
}










