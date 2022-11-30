package com.day1.session1.ex1;

import com.day1.session1.common.Employee;

import java.util.Comparator;

//A interface is stb FI iff it have only one abstract method  SAM
@FunctionalInterface
interface MyInnterface{
    void foo();
   default  void foo2(){
       System.out.println("default foo2 method");
   }
    static  void fooStack(){
        System.out.println("default foo2 method");
    }
    private   void foo2Methods(){
        System.out.println("this is some private method inside the interface");
    }

}
public class B_WhatIsFI {
    public static void main(String[] args) {



//        Comparator<Employee>  comparator=new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Double.compare(o2.getSalary(), o1.getSalary());
//            }
//        };

//        Comparator<Employee>  comparator=(Employee o1, Employee o2) ->{
//                return Double.compare(o2.getSalary(), o1.getSalary());
//
//        };
//        Comparator<Employee>  comparator=(Employee o1, Employee o2) ->
//                Double.compare(o2.getSalary(), o1.getSalary());

//        Comparator<Employee>  comparator=( o1,  o2) ->
//                Double.compare(o2.getSalary(), o1.getSalary());

        // one two three
       // Comparator.comparing(Employee::getSalary).reversed();

        //lambda   -> vs method ref Employee::getSalary
        //method ref is a syntex supger on lambda

//        Comparator<String> comparator2=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//
//        Comparator<String> comparator=( o1,  o2)-> o1.compareTo(o2);



       // Comparator<String> comparator=( o1,  o2)-> o1.compareTo(o2);






        Runnable runnable=()-> System.out.println("run method");



        //FunctionalInterface support lambda
        //labda vs ann inner class

        System.out.println("'hello");
//        MyInnterface myInnterface=new MyInnterface() {
//            @Override
//            public void foo() {
//
//            }
//        };
//        MyInnterface myInnterface2=new MyInnterface() {
//            @Override
//            public void foo() {
//
//            }
//        };
//        MyInnterface myInnterface3=new MyInnterface() {
//            @Override
//            public void foo() {
//
//            }
//        };

        //"Type inference": actaully what is means taht now ref is pointing to peice of code
        //very similer to js
//        let a=function(){
//
//        }
        //very imp diff bw ann inner classs and lamanbd
        //lambada dont have its own this*

        MyInnterface myInnterface=() -> System.out.println("hello");

        myInnterface.foo();


    }
}





