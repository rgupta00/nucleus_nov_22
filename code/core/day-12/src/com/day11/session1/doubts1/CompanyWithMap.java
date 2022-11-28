package com.day11.session1.doubts1;

import java.util.*;

public class CompanyWithMap {
    private  String companyName;
    private Map<Integer, Employee> employees;

    private  int empCount=0;
    public CompanyWithMap(String companyName){
        this.companyName=companyName;
        employees=new HashMap<>();
    }
    public void addEmp(String name, double salary){
        Employee employee=new Employee(name,salary);

       employees.put(++empCount, employee);

    }
    public void printEmployee(){
        System.out.println("---print all emps--------");
       Set<Map.Entry<Integer, Employee>> entrySet=  employees.entrySet();
       for (Map.Entry<Integer, Employee> entry: entrySet){
           System.out.println(entry.getKey()+" : "+ entry.getValue());
       }

    }
    //dont escap the ref
    public Map<Integer, Employee> getEmployeesMap(){
       // return employees;     // bad code
        //vs

        return Collections.unmodifiableMap(employees);
    }


}
