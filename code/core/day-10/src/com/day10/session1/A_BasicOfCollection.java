package com.day10.session1;
import java.util.*;
//Comparable vs Comparator
public class A_BasicOfCollection {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("jar");

        //ehnance for loop : arrary collection
        printList(list);
        System.out.println("----------sorting -------------");
        Collections.sort(list);
        int index=Collections.binarySearch(list, "abc");

//    Collections.sort(list, new Comparator<String>() {
//        @Override
//        public int compare(String o1, String o2) {
//            return o2.compareTo(o1);
//        }
//    });

        //printList(list);

    }

    private static void printList(List<String> list) {
        Iterator<String> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
