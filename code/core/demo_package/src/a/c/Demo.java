package a.c;

import a.b.*;

public class Demo extends A {
    public static void main(String[] args) {
    /*

if a class is public then its protected data/method can be access in other package
iff the class of another package sub class that class
     */
       Demo demo=new Demo();
       demo.fooProteted();
        System.out.println(demo.m);
    }
}
