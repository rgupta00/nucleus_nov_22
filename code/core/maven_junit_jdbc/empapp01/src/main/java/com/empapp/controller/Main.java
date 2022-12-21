package com.empapp.controller;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.Gender;
import com.empapp.dao.impl.EmployeeDaoImplJdbc;
import com.empapp.dao.impl.EmployeeDaoImplMap;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();
        Employee employee=new Employee(12343,"raj",67000,"raj@gmail.com",
                "8644331190", Gender.M);

        Employee employee2=new Employee(12843,"ekta",97000,"ekta@gmail.com",
                "9644330190", Gender.F);

        Employee employee3=new Employee(12543,"anuj",6000,"anuj@gmail.com",
                "7644331188", Gender.M);


        employeeService.addEmployee(employee);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);

        List<Employee> employees=employeeService.getAll();

        employees.forEach(e-> System.out.println(e));
        System.out.println("---------");

       // employeeService.deleteEmployee(12843);

//        Employee employee4=new Employee(19543,"umesh",6700,"umesh@gmail.com",
//                "5644031188", Gender.M);
//
//        employeeService.addEmployee(employee4);
//
//        System.out.println("------------");
//        employees=employeeService.getAll();
//        employees.forEach(e-> System.out.println(e));
//        System.out.println("---------");



    }
}











