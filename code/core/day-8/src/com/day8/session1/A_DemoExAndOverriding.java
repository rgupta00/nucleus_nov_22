package com.day8.session1;

import java.io.IOException;
import java.sql.SQLException;

class X{
    X()throws Exception{
        System.out.println("ctr of class X");
    }
   void  foo()throws Exception {
       System.out.println("foo of class X");
   }
}
class Y extends X{
    Y()throws Exception{
        System.out.println("ctr of class Y");
    }
    @Override
    void  foo()throws  StackOverflowError {
        System.out.println("foo of class Y overriden version");
    }
}




public class A_DemoExAndOverriding {
    public static void main(String[] args) {

    }
}
