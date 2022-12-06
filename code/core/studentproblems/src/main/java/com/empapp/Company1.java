package com.empapp;

import java.util.ArrayList;
import java.util.List;

public class Company1 {
    public List<Employee> employees;

    public Company1(){
        employees=new ArrayList<>();
    }
    public void addEmployee(Employee e){
        employees.add(e);
    }

    public void printAllRecords(){
        for(Employee e: employees){
            System.out.println(e.getData());
        }
    }
}
