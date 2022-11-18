package com.day7.session1;

public class A_DemoPrintStackTracke {
    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        bar();
    }

    private static void bar() {
        car();
    }

    private static void car() {
        String data=null;
        System.out.println(data.toUpperCase());
    }
}
