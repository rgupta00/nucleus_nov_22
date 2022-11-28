package com.day11.session2;

import com.day11.common.Employee;

import java.util.Comparator;

public class H_GenMethods {
    public static void main(String[] args) {
        //o1, o2, o3
//        Integer a=-33;
//        Integer b=303;
//        Integer c=33;

//        Double a=-33.00;
//        Double b=303.0;
//        Double c=33.88;


        String b="ekta";
        String c="gunika";
        String a="raj";

        Employee e1= new Employee(1,"raj",6000);
        Employee e2=new Employee(18,"ekta",7000);
        Employee e3=new Employee(199,"gunika",8000);
       Employee emp=max(e1, e2, e3) ;
        System.out.println(emp);
//        String d=max(a, b , c);
//        System.out.println(d);
    }
    public static  <T extends Comparable<T>> T max(T a, T b, T c){
        T maxValue=a;
        if(b.compareTo(a)>0)
            maxValue=b;
        if(c.compareTo(maxValue)>0)
            maxValue=c;
        return maxValue;

    }
}
