package com.day12.revision;
import com.day11.common.EmpAsPerSalary;
import com.day11.common.Employee;

import java.util.*;
public class A_Basics {
    public static void main(String[] args) {
        List<Employee> data=new ArrayList<>();
        data.add(new Employee(1,"raj",6000));
        data.add(new Employee(18,"ekta",7000));
        data.add(new Employee(199,"gunika",8000));
      //  Collections.sort(data);

        printAllEmployees(data);

        Collections.sort(data, new EmpAsPerSalary());


//        List<String> data=new ArrayList<>();
//        data.add("foo");
//        data.add("bar");
//        data.add("jar");

        //iterator: Enumerator, Iterator, ListIterator
//        Iterator<String> it=data.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        ListIterator<String> it=data.listIterator(data.size());
//        while (it.hasPrevious()){
//            System.out.println(it.previous());
//        }



        //List:
        //Set
        //Map
        //Queue:
        //Performance, some imp question quick revision



    }

    private static void printAllEmployees(List<Employee> data) {
        Iterator<Employee> it= data.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
