package com.day9.session1;
class A {
    A(){

    }
        void foo(){
            System.out.println("foo of class A");
        }
}

class B extends  A {
    B(){
        super();
    }
    void foo(){
        super.foo();
        System.out.println("foo of class B");
    }
}

public class Demo {
    public static void main(String[] args) {
        String a="Foo";
        String b="FOo";
        System.out.println(b.compareTo(a));
//       for (String a: args){
//           System.out.println(a);
//       }
    }
}
