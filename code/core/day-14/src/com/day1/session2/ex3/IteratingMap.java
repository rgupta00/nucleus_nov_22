package com.day1.session2.ex3;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class IteratingMap {
    public static void main(String[] args) {
        //biConsumer
        Map<String, Integer> map=new HashMap<String, Integer>();
        map.put("raj",90);
        map.put("amit",89);
        map.put("ekta",87);
        map.put("seema",97);

        //how to iterate map in java 8 syntex
      //  map.forEach(( k,  v)-> System.out.println(k+" : "+ v));
        //print the map sorted as per key
//        map.entrySet().stream()
//                .forEach(new Consumer<Map.Entry<String, Integer>>() {
//                    @Override
//                    public void accept(Map.Entry<String, Integer> e) {
//                        System.out.println(e.getKey()+" : "+ e.getValue());
//                    }
//                });

//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey())
//                .forEach( e -> System.out.println(e.getKey()+" : "+ e.getValue()));

        //print the map sorted as per value

        //.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        //reveres sort?
        map.entrySet()
                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach( e -> System.out.println(e.getKey()+" : "+ e.getValue()));




    }
}
