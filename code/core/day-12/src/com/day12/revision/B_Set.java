package com.day12.revision;
import com.day11.common.EmpAsPerSalary;
import com.day11.common.Employee;

import  java.util.*;
public class B_Set {
    public static void main(String[] args) {
        Set<Employee> data=new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });
        data.add(new Employee(1,"raj",6000));
        data.add(new Employee(18,"ekta",7000));
        data.add(new Employee(199,"gunika",8000));

      //  System.out.println(data.contains(new Employee(1,"raj",6000)));

        printAllEmployees(data);


//        Set<String> data=new TreeSet<>();
//       data.add("foo");
//       data.add("bar");
//        data.add("jar");
//        System.out.println(data);
    }
    private static void printAllEmployees(Set<Employee> data) {
        Iterator<Employee> it= data.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
