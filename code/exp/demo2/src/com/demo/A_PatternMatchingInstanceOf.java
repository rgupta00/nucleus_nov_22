package com.demo;
record Emp(  int id,String name){
    public Emp{
        if(id==0 || name==null){
            throw  new IllegalArgumentException();
        }

    }
}
public class A_PatternMatchingInstanceOf {
    public static void main(String[] args) {
      enum Day{MON, TUE, WED, THRS, FRI, SAT, SUN} ;


    }
}
