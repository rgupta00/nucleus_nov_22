package com.day7.demo;

class A extends Exception{
}
class B extends A{
}

class X{
    void foo() throws A{
        System.out.println("I");
    }

}
class Y extends X{
    void foo() throws B{
        System.out.println("II");
    }

}
public class Demo {
    public static void main(String[] args) {
        X x=new Y();
        try{
            x.foo();
        }catch (A a){
            System.out.println("some ex occ");
        }
    }
}
