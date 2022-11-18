package com.day7.session1;

import java.io.FileNotFoundException;

public class B_FinallySomeImpPoints {
    public static void main(String[] args) {
        /*
        1.never retrun value from finally block
        2. never throw ex from finally block
         */
//       int val= foo();
//        System.out.println(val);

        bar();
    }

    private static void bar() {
        try{
            //
            if(1==1)
            throw new FileNotFoundException();

        }finally {
           throw new NullPointerException();
        }
    }

    private static int foo() {
        try{
            //
            return 5;
        }finally {
            return 10;
        }
    }
}
