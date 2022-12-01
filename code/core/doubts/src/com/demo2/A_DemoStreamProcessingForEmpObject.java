package com.demo2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A_DemoStreamProcessingForEmpObject {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"raj",9000));
        employees.add(new Employee(199,"faizan",70000));
        employees.add(new Employee(19,"tarun",10000));
        employees.add(new Employee(17,"ekta",11800));

        Comparator<Employee> c=( o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary());





      // employees.forEach(e-> System.out.println(e));

//        employees.stream()
//                .filter(e-> e.getSalary()>=7000)
//                .sorted()// natural sort
//                .forEach(e-> System.out.println(e));



//        employees.stream()
//                .filter(e-> e.getSalary()>=7000)
//                .sorted(( o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()))// comprator
//                .forEach(e-> System.out.println(e));

        employees.stream()
                .filter(e-> e.getSalary()>=7000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())// comprator
                .forEach(e-> System.out.println(e));


//        List<Employee> eList=  employees.stream()
//                .filter(e-> e.getSalary()>=7000)
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())// comprator
//                .collect(Collectors.toList());

        List<String> eList=  employees.stream()
                .filter(e-> e.getSalary()>=9200)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())// comprator
                .map(e-> e.getName())
                .collect(Collectors.toList());

        eList.forEach(name-> System.out.println(name));

    }
}
