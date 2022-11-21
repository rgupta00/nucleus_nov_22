package com.day8.session1;
class A{
    void foo(){
        System.out.println("foo method of class A");
    }
}
class B extends  A{
    void foo(){
        System.out.println("foo method of class B");
    }
    void foofB(){
        System.out.println("foofB method of class B");
    }
}

class C extends  A{
    void foo(){
        System.out.println("foo method of class C");
    }
    void foofC(){
        System.out.println("foofC method of class C");
    }
}

public class D_ClassCastEx {
    public static void main(String[] args) {
       A a1=new B();
       A c1=new C();

//       B b1= (B) a1;
//       b1.foofB();
        if(c1 instanceof B) {
            B b1 = (B) c1;
            b1.foofB();
        }else
            System.out.println("it is not possible");
    }
}
