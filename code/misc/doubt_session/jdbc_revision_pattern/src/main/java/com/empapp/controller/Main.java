package com.empapp.controller;
import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import  java.util.*;
//controller :Servlet
public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService=new EmployeeServiceImpl();
        System.out.println("showing all records");
        System.out.println("-----------------");
        List<Employee>employees=employeeService.getAll();
        employees.forEach(e-> System.out.println(e));

//        System.out.println("inert a new emp------");
//        Employee employee=new Employee("chaitanya",8000);
//        employeeService.addEmployee(employee);

//        System.out.println("-----update-------");
//        employeeService.updateEmployee(5,80000);

        System.out.println("-----delete-------");
        employeeService.deleteEmployee(3);

        System.out.println("--------");
        employees=employeeService.getAll();
        employees.forEach(e-> System.out.println(e));
    }
}
