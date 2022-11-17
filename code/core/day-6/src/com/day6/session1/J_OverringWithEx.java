package com.day6.session1;

import java.io.IOException;
import java.sql.SQLException;

//Why this rule:
class M{
    void foo()throws Exception{

    }
    void foo(int i)throws SQLException {

    }
}
class A{
    void foo()throws  Exception{
        System.out.println("foo method of A class");
    }
}
class B extends A{
    @Override
    void foo() {
        System.out.println("foo method of B class");
    }
}

public class J_OverringWithEx {
    public static void main(String[] args) {
        A a=new B();
        try{
            a.foo();
        }catch (Exception e){

        }
    }
}
