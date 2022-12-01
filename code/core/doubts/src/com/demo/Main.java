package com.demo;
class Cal{
    double add(int a, double b){
        System.out.println("double add(int a, double b)");
        return a+b;
    }
    double add(double a, int b){
        System.out.println("double add(double a, int b");
        return a+b;
    }

}
//funcation overloading
public class Main {
    public static void main(String[] args) {
        Cal cal=new Cal();
        double result=cal.add(3,4.0);
    }
}