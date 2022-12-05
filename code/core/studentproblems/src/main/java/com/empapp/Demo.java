package com.empapp;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Employee[]employees={
                new Employee(199,"raj",7000),
                new Employee(18,"ekta",7800),
                new Employee(109,"umesh",9000),
                new Employee(100,"seema",89000)
        };

        Comparator<Employee> comparator=( o1,  o2)-> Double.compare(o2.getSalary(), o1.getSalary());

        Arrays.sort(employees, comparator);

        for (Employee e: employees){
            System.out.println(e);
        }
    }
}
