package com.day11.session2;
import java.util.*;
public class C_IdentityHM {
    public static void main(String[] args) {
        Integer it1=new Integer(4);
        Integer it2=new Integer(4);
        System.out.println(it1==it2);
        System.out.println(it1.equals(it2));
//
//        Map<Integer, String>map=new HashMap<>();
//        map.put(it1,"first value");
//        map.put(it2,"sec value");
//        System.out.println(map);

//        IdentityHashMap<Integer, String>map=new IdentityHashMap<>();
//        map.put(it1,"first value");
//        map.put(it2,"sec value");
//        System.out.println(map);
    }
}
