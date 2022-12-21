package com.empapp.controller;
import  java.util.*;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();

        System.out.println("------get all emp---------");
        List<Employee> employees=employeeService.getAll();
        employees.forEach(e-> System.out.println(e));

        Employee employee=new Employee("tarun",7000);
        employeeService.addEmployee(employee);

        System.out.println("---------------");
        employees=employeeService.getAll();
        employees.forEach(e-> System.out.println(e));

    }
}
