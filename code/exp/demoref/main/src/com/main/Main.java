package com.main;

//import com.demo.Hello;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception{
       Class<?> clazz=Class.forName("com.demo.Hello");
        Constructor []constructors=clazz.getDeclaredConstructors();
       Object o= constructors[0].newInstance();
        System.out.println(o);
    }
}