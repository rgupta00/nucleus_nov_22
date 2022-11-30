package com.day1.session1.ex1;

import com.day1.session1.common.Employee;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class C_JavaReadyMadeFI {
    public static void main(String[] args) {
        //is name is strated from "raj"
//        Predicate<String> p1=new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                return name.contains("raj");
//            }
//        };

      //  Predicate<String> p1= name-> name.contains("raj");
       // System.out.println(p1.test("amit"));

//        Predicate<Integer> evenPredicate=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer no) {
//                return no%2==0;
//            }
//        };

        //either even or more then 100

        Predicate<Integer> evenPredicate= no-> no%2==0;

        Predicate<Integer> moreThe100Predicate= no->no>100;

        Predicate<Integer> p3=evenPredicate.and(moreThe100Predicate).negate();

        System.out.println(p3.test(121));

        //predicate for rich emp salary > 50L

        Predicate<Employee> employeePredicate= e -> e.getSalary()>=50_000_00;

        //e1 , e2 if e1 have more salary then e2 then retrun e1 or else e2
        BiPredicate<Employee, Employee> employeeEmployeeBiPredicate=
               ( employee1,  employee2) -> employee1.getSalary()> employee2.getSalary();


        Employee e1=new Employee(1,"raj",50_000_00);
        Employee e2=new Employee(18,"sumit",34_000_00);


        boolean flag =employeeEmployeeBiPredicate.test(e1, e2);
        System.out.println(flag);

        //how it can appled to list of emp *


    }
}
