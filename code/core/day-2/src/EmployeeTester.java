import java.sql.SQLOutput;

public class EmployeeTester {

    public static void main(String[] args) {
       Employee employee=new Employee(3,"raj",5000);
       employee.printEmployeeDetails();

       employee.changeSalary(6000);
        employee.printEmployeeDetails();

   // Employee employee1=new Employee(employee);


    }
}
