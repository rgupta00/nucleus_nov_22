package com.doubts;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//how to create custom annotation
@Target({ElementType.METHOD,ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
  String myInfo() default "nu champs";
  boolean isDone() default false;
}
//2 annotation apply karan
class MyClass{
    @MyAnno(isDone = true)
    public void foo(){
        System.out.println("foo method of class MyClass");
    }
}
//3. annotation ko process karna: java reflection

public class DemoCustomerAnnotation {
    public static void main(String[] args) throws Exception{
        Class<?>clazz=Class.forName("com.doubts.MyClass");
        Method[]methods=clazz.getDeclaredMethods();
        for (Method m: methods){
            if(m.isAnnotationPresent(MyAnno.class)){
                MyAnno myAnno=m.getAnnotation(MyAnno.class);
                System.out.println(myAnno.isDone()+" : "+ myAnno.myInfo());
            }
        }
    }
}
