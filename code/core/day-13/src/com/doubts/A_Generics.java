package com.doubts;
/*
    1. type safty net... type erased
    2. compile time funda
    3. dont support polymorphic behiavior
    4. <? exteds XX> vs <? super XXX> PECS
    5. can help to set business contants
    5. genc class ,generics method ...
 */
//stack pop and push operation

import com.common.Employee;

import java.lang.reflect.Array;

class  Stack<T extends Comparable>{
    private T arr[];
    int top;
    int max;
    public Stack(Class clazz){
        max=5;
        arr= (T[])Array.newInstance(clazz,max);
        //arr=new Employee[5];
        top=-1;
    }
    public void push(T data){
        if(top==max-1)
            throw new IllegalStateException("cant push more item");
        arr[++top]=data;
    }
    public T pop(){
        if(top==-1)
            throw new IllegalStateException("cant pop item");
       //return arr[top--];
        T e=arr[top];
        arr[top]=null;
        top--;
        return e;
    }

}

class Dog{

}


public class A_Generics {
    public static void main(String[] args) {
        Employee e=new Employee(1,"foo",7000);
        Class<?> clazz=  e.getClass();


        Employee e2=new Employee(661,"foo",7000);
        Class<?> clazz2=  e2.getClass();
        System.out.println(clazz2==clazz);


        Dog d=new Dog();
        Class<?> clazz3=d.getClass();
        System.out.println(clazz2==clazz3);






//        Stack<Integer> stack=new Stack<>(Integer.class);
//        stack.push(6);
//        stack.push(8);
//        stack.push(6);
//        stack.push(8);
//        stack.push(6);
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        Stack<Employee> stack=new Stack<>(Employee.class);
        stack.push(new Employee(1,"raj",8000));
        stack.push(new Employee(16,"raj",8000));
        stack.push(new Employee(155,"raj",8000));
        stack.push(new Employee(51,"raj",8000));
        stack.push(new Employee(188,"raj",8000));

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}




