package com.doubts;

import com.common.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class BasicsOfReflection {
    public static void main(String[] args)throws ClassNotFoundException {
        //class loading: static vs dynamic

        //static class loading
        Employee e=new Employee(1,"foo",7000);

        //Dynamic class loading
       Class<?> clazz=   Class.forName("com.common.Employee");

    //how u can get information of a Class
//        Class<?> clazz2=e.getClass();
//
//        Class<?> clazz3=Employee.class;

    //how to get inforamtion about the class using reflection api
        //u want to get all method info of class

        Method[]methods=clazz.getDeclaredMethods();//getMethods vs getDeclareMethods
        for (Method method: methods){
            System.out.println(method.getName()+" : "+ Modifier.toString(method.getModifiers()) +" :"+method.getReturnType());
        }










//        Employee e=new Employee(1,"foo",7000);
//        Class<?> clazz=  e.getClass();
//
//
//        Employee e2=new Employee(661,"foo",7000);
//        Class<?> clazz2=  e2.getClass();
//        System.out.println(clazz2==clazz);
//
//
//        Dog d=new Dog();
//        Class<?> clazz3=d.getClass();
//        System.out.println(clazz2==clazz3);
    }
}
