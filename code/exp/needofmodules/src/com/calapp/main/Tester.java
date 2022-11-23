package com.calapp.main;

import com.calapp.internal.CalHelper;
import com.calapp.logic.Cal;

public class Tester {
    public static void main(String[] args) {
        Cal cal=new Cal();
        CalHelper calHelper=new CalHelper();
        System.out.println(cal.add(2,3));
    }
}
