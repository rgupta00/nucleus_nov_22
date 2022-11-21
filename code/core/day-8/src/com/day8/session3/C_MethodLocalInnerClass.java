package com.day8.session3;
//a method local innner class can acces local data of the method
//but that data must be final or "effectively final"
class A{
    void foo(){
       final int i=5;
        class B{
            void  foofB(){
                System.out.println("foofB method "+i);
            }
        }
        B b=new B();
        b.foofB();
        //return b;
    }
}
public class C_MethodLocalInnerClass {
    public static void main(String[] args) {

        A a=new A();
        a.foo();
    }
}
