package com.day1.session1.ex1;

import com.day1.session1.common.Emp;
import com.day1.session1.common.EmpDto;
import com.day1.session1.common.Employee;
import com.day1.session1.common.EmployeeData;

import java.util.Comparator;
import java.util.function.*;

//A interface is stb FI iff it have only one abstract method  SAM

public class B_WhatIsFI {
    public static void main(String[] args) {


        //FI: Predicate
//        Predicate<Integer> p1= no-> no%2==0;
//        Predicate<Integer> p2=no->no>100;
//        Predicate<Integer> p3=p1.and(p2);
//        System.out.println(p3.test(121));

    //    BiPredicate<Integer, Integer> p4=( x,  y)-> x>y;

//        Predicate<Employee> p5=e-> e.getSalary()>5_000_000;
//
//        Employee e= new Employee(1,"raj",8_000_00);
//        System.out.println(p5.test(e));

        //Employee -> salary
        Function<Employee, Double> f1= e-> e.getSalary();
        //Employee -> EmployeeData

        Employee e2= new Employee(1,"raj",8_000_00);
        Function<Employee, EmployeeData> f2= e-> new EmployeeData(e.getId(), e.getSalary());

        //we want the net saalry of emp
    /*
     public Emp(int id, String name, double hra, double ta, double da, double commission,
               double carAllowencce, double reallocation, double monthlySalary) {
     */
        Emp e=new Emp(1,"raj",12000,10000, 2000,
                30000, 10000,23000,
                23000 );
        System.out.println(e);

        //Emp -> EmpDto
//        Function<Emp, EmpDto> f3= emp->
//                new EmpDto(emp.getName(), emp.netSalaray());
//
//        EmpDto empDto=f3.apply(e);
//        System.out.println(empDto);

        Consumer<String> c= s ->System.out.println(s);

        Consumer<Emp> c2=e3-> System.out.println(e3);

        //used for map
        BiConsumer<String, Integer> c3=(x,y)-> System.out.println(x+" : "+y);


    }
}





