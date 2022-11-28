package com.day11.session2;

import java.time.LocalDate;

public class E_HowCachingWorksInWrapperClasses {
    public static void main(String[] args) {
        int i=4;

        Integer it1=222;
        Integer it2=222;

        System.out.println(it1==it2);

       // Integer it2=new Integer(4);


//        System.out.println(it1==it2);
//        System.out.println(it1.equals(it2));
    }
}
