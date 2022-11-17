package com.day5.session2.doubts;
class A{
    static int i=77;
    static  void foo(){
        System.out.println("1");
    }
}
class B extends  A{
    static  int i=779;

    static  void foo(){
        System.out.println("2");
    }
}
public class E_Demo {

    public static void main(String[] args) {
        B a=new B();

        a.foo();

    }
}
