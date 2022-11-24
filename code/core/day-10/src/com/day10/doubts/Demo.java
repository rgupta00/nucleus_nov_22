package com.day10.doubts;

import com.day10.session1.EmpType;

public class Demo {
    public static void main(String[] args) {
        Emp e=new Emp(1,"ra",6000, EmpType.FTime);
        Emp e2=EmpDemo.changeSalary(e);
    }
}
