package com.day11.session3;

import com.day11.common.Employee;

public class DemoGenericsStack {
    public static void main(String[] args) {

        Stack<Employee> stack=new StackImplArray<>(Employee.class);
        stack.push(new Employee(1,"raj",900));
        stack.push(new Employee(1,"raj",900));


        System.out.println("---------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());


//        Stack<Double> stack=new Stack<>(Double.class);
//        stack.push(33.00);
//        stack.push(339.88);
//        stack.push(63.66);
//        stack.push(73.99);
//        stack.push(34.99);
//
//
//        System.out.println("---------");
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Stack<Integer> stack=new Stack<Integer>(Integer.class);
//        stack.push(33);
//        stack.push(339);
//        stack.push(63);
//        stack.push(73);
//        stack.push(34);
//
//
//        System.out.println("---------");
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());




    }
}
