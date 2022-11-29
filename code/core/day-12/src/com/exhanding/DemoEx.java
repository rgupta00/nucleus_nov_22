package com.exhanding;

import java.sql.SQLException;

public class DemoEx {
    public static void main(String[] args) {

        foo();
    }

    private static void foo() {
        try{
            if(1==1)
                throw  new NullPointerException();
        }finally {

        }
    }
}
