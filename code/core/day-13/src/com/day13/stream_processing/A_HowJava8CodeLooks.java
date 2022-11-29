package com.day13.stream_processing;
import com.common.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class A_HowJava8CodeLooks {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(100,"raj",8000));
        employees.add(new Employee(18,"ekta",7000));
        employees.add(new Employee(16,"gun",6800));
        employees.add(new Employee(61,"keshav",9000));
        employees.add(new Employee(619,"foo",4000));


        List<String>empNames=employees.stream()
                .filter(e-> e.getSalary()>6000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(e-> e.getName())
                .collect(Collectors.toList());

        empNames.stream().parallel().forEach(name-> System.out.println(name));

        //u print nome of all emp whose salary is greate then 600 in dec order

        //we sort the data as per saalry in dec...
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Double.compare(o2.getSalary(), o1.getSalary());
//            }
//        });
//        List<String> employeesName=new ArrayList<>();
//        for (Employee employee: employees){
//            if(employee.getSalary()>6000){
//                employeesName.add(employee.getName());
//            }
//        }
//
//        //print it
//        for (String name: employeesName){
//            System.out.println(name);
//        }
    }
}
