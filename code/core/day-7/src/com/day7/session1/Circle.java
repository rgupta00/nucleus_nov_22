package com.day7.session1;
import  static java.lang.Math.*;
class NegativeRadiusException extends Exception{
    public NegativeRadiusException(String message){
        super(message);
    }
}
public class Circle {
    private int radius;

    public Circle(int radius)throws NegativeRadiusException {
        this.radius = radius;
        if (radius<=0)
            throw new NegativeRadiusException("-ve radius is not allowed");
    }
    public void printArea(){
        System.out.println(PI*radius*radius);
    }
}
