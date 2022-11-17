package com.day6.session1.ex2;

import java.io.IOException;
import java.sql.SQLException;

class A{
   A() {
       System.out.println("ctr of class A");
   }
}
class B extends A{
    B()throws Exception{
        System.out.println("ctr of class B");
    }
}

public class J_CtrWithEx {
    public static void main(String[] args) {

    }
}
