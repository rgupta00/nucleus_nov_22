package com.demo;

class Emp{


    @Override
    protected void finalize() throws Throwable {
        System.out.println("hello it is called");
    }
}
public class DemoEmp {

    public static void main(String[] args) {
        
    }
}
