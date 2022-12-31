package com.core.topic1.ocp.wrong;
//SW should be open for extension close for modification
class Calculator{
    public int process(int a, int b, String op){
        if(op.equals(op.equals("add"))){
            return  a+b;
        }else if(op.equals(op.equals("mul"))){
            return  a*b;
        }else if(op.equals(op.equals("divide"))){
            return  a/b;
        }
        else throw new IllegalArgumentException();
    }
}

public class DemoOCP {
}
