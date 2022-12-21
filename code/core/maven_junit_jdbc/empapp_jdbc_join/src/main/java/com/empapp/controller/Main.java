package com.empapp.controller;
import java.util.*;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();

        System.out.println("---all the records----");
        List<Employee> employees=employeeService.getAll();
        employees.forEach(e-> System.out.println(e));

//        Employee employee=new Employee("raja",8000);
//        employeeService.addEmployee(employee);
//
//        System.out.println("----after adding a records----");
//        employees=employeeService.getAll();
//        employees.forEach(e-> System.out.println(e));

//        System.out.println("-----update ----");
//         employeeService.updateEmployee(3, 10000);

//        employeeService.deleteEmployee(3);
//        employees=employeeService.getAll();
//        employees.forEach(e-> System.out.println(e));

    }
}
