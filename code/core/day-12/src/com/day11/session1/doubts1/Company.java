package com.day11.session1.doubts1;

import java.util.Arrays;
//Growable array
public class Company {
    private  String companyName;
    private Employee[]employees;

    private  int empCount=0;
    private  static  int MAX_EMP_LIMIT=10;
    public Company(String companyName){
        this.companyName=companyName;
        employees=new Employee[MAX_EMP_LIMIT];
    }
    public void addEmp(String name, double salary){
        Employee employee=new Employee(name,salary);
        if(empCount>MAX_EMP_LIMIT-1){
            System.out.println("cant add more emp");
        }
        employees[empCount++]=employee;

    }
    public void printEmployee(){
        System.out.println("---print all emps--------");
        for(int i=0;i< empCount; i++){
            System.out.println(employees[i]);
        }
    }
    public Employee[] getEmployees(){
        return Arrays.copyOf(employees, employees.length);
    }


}
