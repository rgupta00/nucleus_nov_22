package com.doubts;

import java.lang.reflect.Constructor;

class MySingleton{
    private static  MySingleton mySingleton=new MySingleton();
    private MySingleton(){
        if(mySingleton!=null)
            throw  new IllegalStateException("dare not to do it");
        System.out.println("dare to call me");
    }
    public static MySingleton getMySingleton(){
        return mySingleton;
    }
}
public class HowToBreakSingleton {
    public static void main(String[] args) throws Exception{
        // :(
        //singleton can be broken using java reflection
        MySingleton singleton1=MySingleton.getMySingleton();

        Class<?> clazz=Class.forName("com.doubts.MySingleton");
        Constructor[]constructors=clazz.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        MySingleton singleton2=(MySingleton) constructors[0].newInstance();

        System.out.println(singleton2==singleton1);
    }
}

