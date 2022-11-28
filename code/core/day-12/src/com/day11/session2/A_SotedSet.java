package com.day11.session2;
import  java.util.*;
public class A_SotedSet {
    public static void main(String[] args) {
        //SortedSet vs NavigableSet

        NavigableSet<Integer> set=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        set.add(100);
        set.add(101);
        set.add(104);
        set.add(106);
        set.add(110);
        set.add(115);
        set.add(120);
        System.out.println(set);
       // System.out.println(set);
        System.out.println("head set  set.headSet(106)");
        System.out.println(set.headSet(106));

        System.out.println("tail set set.tailSet(106)");
        System.out.println(set.tailSet(106));

        Comparator<?> integerComparator=  set.comparator();
        System.out.println(integerComparator);


    }
}
