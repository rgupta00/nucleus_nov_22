package com.empapp.controller;

public class DemoEx {
    public static void foo()throws  Exception{
        try{
            throw new Exception();

        }
        finally {
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {

        try {
            foo();
            System.out.println("hi");
        } catch (Exception e) {
            System.out.println("ex");
        }finally {
            System.out.println("done");
        }
    }
}
