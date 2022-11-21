package com.day8.session3;

import java.util.Map;

class M{
    class N{

    }
    public void foo(){
        N n=new N();
    }
}
public class E_HowManyClasses {
    public static void main(String[] args) {
        M m=new M();
        m.foo();
        System.out.println("done");
        //zero object design pattern
    }
}
