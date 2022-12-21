package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.Gender;
import com.empapp.dao.exceptions.EmployeeValiationException;
import com.empapp.dao.validation.EmployeeValidation;
import org.junit.After;
import static  org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    private EmployeeService employeeService;
    @Before
    public void setUp() throws Exception {
        employeeService=new EmployeeServiceImpl();
        Employee employee=new Employee(12343,"raj",67000,"raj@gmail.com",
                "8644331190", Gender.M);

        Employee employee2=new Employee(12843,"ekta",97000,"ekta@gmail.com",
                "9644330190", Gender.F);

        Employee employee3=new Employee(12543,"anuj",6000,"anuj@gmail.com",
                "7644331188", Gender.M);

        employeeService.addEmployee(employee);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);
    }

    @Test
    public void getAll() {
        assertEquals(3, employeeService.getAll().size());
    }

    //---------------get an employee--------
    @Test
    public void getEmployeeById() {
    }


    //---------------get an employee--------
    @Test
    public void getEmployeeById_EmployeeNotFoundExcception() {
    }

    @Test
    public void addEmployee_success() {
    }

    @Test  //(expected = EmployeeValiationException.class)
    public void addEmployee__ValationError() {
    }

    @Test
    public void deleteEmployee() {
    }

    @Test
    public void updateEmployee() {
    }

    @After
    public void tearDown() throws Exception {
        employeeService=null;
    }


}