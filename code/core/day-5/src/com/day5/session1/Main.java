package com.day5.session1;

import java.io.Serializable;
import java.util.StringTokenizer;

interface A{
    int i=0;
    int foo();
}


class B{

    public int abc(){
        return 123;
    }
}



class C extends B  implements A{

    public int foo(){
        return 127;
    }
}



public class Main {
    public static void main(String[] args) {

        String s1=new StringBuffer("abc").reverse().toString();

     //  char[]data= s1.toCharArray();


        //String(immutable)          vs StringBuilder vs StringBuffer


//
//        String data1="one"+"two"+"three";
//        //vs
//        String data2=new StringBuilder().append("one").append("two").append("three").toString();



       //String tokens
        //StringTokenizer vs split

        String dateString= "11/11/2011";
        String dateTokens[]=dateString.split("/");
        String data="i love java and teaching";
        String tokens[]=data.split(" ",29);
        for (String token: tokens){
            System.out.println(token);
        }
//        String data="i love java and teaching";
//        StringTokenizer stringTokenizer=new StringTokenizer(data);
//        while (stringTokenizer.hasMoreElements()){
//            System.out.println(stringTokenizer.nextElement());
//        }
        //String a=33+"foo"+5+3;
        //System.out.println(a);

//        String a="foo";
//        String a2=new String("foo");
//        if(a==a2)
//            System.out.println("same");
//        else
//            System.out.println("diff");
        //Serializable
       // A a=new B();
      //  System.out.println(a.foo());
    }
}