package main;

import internal.CalHelper;
import logic.Cal;

public class Main {
    public static void main(String[] args) {
        Cal cal=new Cal();
        CalHelper calHelper=new CalHelper();

        System.out.println(cal.add(2,4));
    }
}