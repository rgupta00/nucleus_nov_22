package com.day1.session1.ex1;

import com.day1.session1.common.Employee;

import java.awt.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class F_StreamInAction {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        List<Employee> employees=
                Arrays.asList(new Employee(1,"raj",50_0000),
                        new Employee(18,"ekta",34_0000),
                        new Employee(77,"sumit",41_0000)
                        );
//        employees.stream().parallel().forEach(e-> System.out.println(e));
//
//        employees.stream().filter(e-> e.getSalary()>=40_0000)
//                .map(e->e.getName())
//                .forEach(e-> System.out.println(e));


        List<String> namesOnly=   employees.stream().filter(e-> e.getSalary()>=40_0000)
                .map(e->e.getName())
                 .collect(Collectors.toList());

//        namesOnly.forEach(name-> System.out.println(name));
        namesOnly.forEach(System.out::println);

//        Iterator<Employee> it=employees.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

    }
}
