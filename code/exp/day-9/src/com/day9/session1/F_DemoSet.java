package com.day9.session1;
import java.util.*;
class StringRevSort implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
public class F_DemoSet {
    public static void main(String[] args) {
        //sorted : rev sort
//        Set<String> set=new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
        Set<String> set=new TreeSet<>(new StringRevSort());
       set.add("foo");
       set.add("bar");
       set.add("car");
       set.add("bar");
        System.out.println(set);
//        Set<String> set=new HashSet<>();//
//        set.

    }
}
