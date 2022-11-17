package com.java10.session1.var_basics;

import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String phoneNo="958543978";
        boolean status= phoneNo.matches("[6-9][0-9]{9}");
        System.out.println(status);

        String email="raj@gmail.com";
        boolean status2=email
                .matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+");
        System.out.println(status2);
        /*
        x*	x occour zero or more then once
        x{n}	x occour n time only
         */
       // System.out.println( Pattern.matches("x{4,7}","xx"));
        //System.out.println(Pattern.matches("\\d",""));
    }
}
