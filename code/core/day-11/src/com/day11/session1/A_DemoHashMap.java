package com.day11.session1;
import  java.util.*;
public class A_DemoHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("raj",90);
        map.put("ravi",70);
        map.put("sumit",92);
        map.put("amit",93);
        //keyset vs entryset
//       Set<Map.Entry<String, Integer>>set=   map.entrySet();
//        System.out.println("---using entrySet-----");
//       for(Map.Entry<String, Integer> entry: set){
//           System.out.println(entry.getKey()+" : "+ entry.getValue());
//       }

         Set<String> set= map.keySet();

        System.out.println("---using keySet-----");

        for (String key: set){
            System.out.println(key+": "+ map.get(key));
        }


    }
}









