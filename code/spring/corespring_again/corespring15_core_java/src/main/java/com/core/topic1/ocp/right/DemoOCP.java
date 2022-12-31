package com.core.topic1.ocp.right;
//SW should be open for extension close for modification
@FunctionalInterface
interface Operation{
    public int apply(int a, int b);
}


class Calculator{
    public int process(int a, int b, Operation operation){
      return  operation.apply(a, b);
    }
}

public class DemoOCP {
    public static void main(String[] args) {
        Operation operation=(a, b)-> a*b;

        Calculator calculator=new Calculator();
        System.out.println(calculator.process(4,2, operation));

    }
}











