package com.day1.session2.ex3;

import java.net.StandardSocketOptions;

interface Operation{
    int apply(int a, int b);
}
 final class Cal{
    static int applyOperation(int a, int b, Operation operation){
        return operation.apply(a, b);
    }
}
public class DemoOCP {
    public static void main(String[] args) {

        Operation adder= (int a, int b) -> a+b;

        System.out.println(Cal.applyOperation(2,3, adder));

        Operation mul= (int a, int b) -> a*b;

        System.out.println(Cal.applyOperation(3,4, mul));

    }
}
