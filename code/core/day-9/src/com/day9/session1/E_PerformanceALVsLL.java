package com.day9.session1;
import java.util.*;
public class E_PerformanceALVsLL {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        //AL time taken : 2172 ms
        //time taken : 9 ms
        calTiming(list);
    }

     static void calTiming(List<Integer> list) {

        for (int i=0;i<1E5; i++){
            list.add(i);
        }
        long start=System.currentTimeMillis();

         for (int i=0;i<1E5; i++){
             list.add(0, i);
         }

         long end=System.currentTimeMillis();
         System.out.println("time taken : "+ (end-start)+ " ms");

    }
}
