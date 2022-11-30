package com.day1.session1.ex1;

import com.day1.session1.common.Employee;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class E_Consumer {
    public static void main(String[] args) {
        //consumer take something dont return any thing (print operation)

        Consumer<String> stringConsumer= name ->System.out.println(name);

        Consumer<Employee> employeeConsumer=e-> System.out.println(e);

//        BiConsumer<Employee, Employee> employeeEmployeeBiConsumer=
//                (e1, e2)-> System.out.println(e1+" : "+ e2);
//
        BiConsumer<Employee, Employee> employeeEmployeeBiConsumer=
               ( e1,  e2)-> System.out.println(e1+ " : "+ e2);


    }
}
