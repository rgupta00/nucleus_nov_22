package com.day8;
interface A1{
    default void foo(){
        System.out.println("A1 foo method");
    }
}
interface A2{
    default void foo(){
        System.out.println("A2 foo method");
    }
}
class FooImp implements A1,A2{
    public void foo(){
        A1.super.foo();
        A2.super.foo();
        System.out.println("A2 foo method");
    }
}
public class DemoJava8 {
    public static void main(String[] args) {

    }
}
