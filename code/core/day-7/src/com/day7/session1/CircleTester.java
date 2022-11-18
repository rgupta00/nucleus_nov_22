package com.day7.session1;

public class CircleTester {
    public static void main(String[] args) {
       try{
           Circle circle=new Circle(-9);
           circle.printArea();
       }catch (NegativeRadiusException e){
           e.printStackTrace();
       }
    }
}
