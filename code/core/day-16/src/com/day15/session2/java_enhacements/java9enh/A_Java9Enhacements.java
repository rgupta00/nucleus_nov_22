package com.day15.session2.java_enhacements.java9enh;
import  java.util.*;
import java.util.Scanner;

public class A_Java9Enhacements {
    //https://github.com/rgupta00/nu_java8_17/tree/master/code/day-3/java9features/src/com/java9features
    public static void main(String[] args) {

        //1. private method inside interface

        //2. u can create the resource outside try block: it is effectivly final
        final Scanner scanner=new Scanner(System.in);
        try(scanner){

        }catch (Exception e){

        }

        //java 8: how to create immutable collection
//        List<String > list=new ArrayList<>();
//        list.add("foo");
//        list.add("bar");
//        list.add("jar");
//
//        List<String > listImmutable=Collections.unmodifiableList(list);
//
//        listImmutable.add("ffff");


//        List<String> listImmutable= List.of("foo","bar","kar");
//        listImmutable.add("6666");

//        Set<String> listImmutable= Set.of("foo","bar","kar","bar");
//        listImmutable.add("6666");

        //map
        Map<String, Integer> map=Map.of("raj",90,"kapil",78);
        map.forEach((k,v)-> System.out.println(k+" : "+ v));

        Map.Entry<String, Integer> e1=Map.entry("amit",90);
        Map.Entry<String, Integer> e2=Map.entry("sumit",97);
      Map.Entry<String, Integer> e3=Map.entry("kapil",70);

       Map<String, Integer> map2=Map.ofEntries(e1, e2,e3);

          Map<String, Integer> map3=
                  Map.ofEntries(Map.entry("amit",90),
                          Map.entry("sumit",97),Map.entry("kapil",70));

    }
}












