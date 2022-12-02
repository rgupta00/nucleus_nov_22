package main;

import internal.CalHelper;
import logic.Cal;

public class Main {
    public static void main(String[] args) {
        CalHelper calHelper=new CalHelper();
         Cal cal=new Cal();
        System.out.println(cal.add(3,6));
    }
}