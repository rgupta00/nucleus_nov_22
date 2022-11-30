package com.day1.session1.ex1;

import com.day1.session1.common.Employee;

import java.util.function.BiFunction;
import java.util.function.Function;

public class D_FunctionFIJava {
    public static void main(String[] args) {
    //Function
       //we have emp object -> we want only name

        //it is just like a transfer method

        Employee emp1=new Employee(1,"raj",50_000_00);
        Employee emp2=new Employee(1,"raj",50_000_00);

        Function<Employee, String> function= employee -> employee.getName();

        Function<Employee, Double> function2=e-> e.getSalary();

        //BiFuction 2 emp total salary
        BiFunction<Employee, Employee, Double> function1=
                (e2,  e3) -> e2.getSalary()+ e3.getSalary();


        System.out.println(function1.apply(emp1, emp2));

    }
}



