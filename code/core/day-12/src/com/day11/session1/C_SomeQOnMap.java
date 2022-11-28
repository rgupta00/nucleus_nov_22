package com.day11.session1;
import  java.util.*;
public class C_SomeQOnMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("ekta",90);
        map.put("ravi",70);
        map.put("sumit",92);
        map.put("raj",93);
        Map<String ,Integer> map2=new TreeMap<>(map);
        System.out.println("sorted as per key");
        System.out.println("print the map");
        Set<Map.Entry<String, Integer>>set=   map2.entrySet();
        for(Map.Entry<String, Integer> entry: set){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
        System.out.println("sorted as per value");
        //?
    }
}
