package com.demo2;
import  java.util.*;
import java.util.stream.Collectors;

public class A_DemoStreamProcessing {
    public static void main(String[] args) {
        List<String> data=new ArrayList<>();
        data.add("anita");
        data.add("raj");
        data.add("jar");
       data.add("rajesh");
        data.add("rajeev");
        //find all names that contain raj

       List<String> names= data.stream()
               .filter(name->name.contains("raj"))
                .sorted()
               .skip(1)
                .limit(2)
                .collect(Collectors.toList());

       names.forEach(name-> System.out.println(name));

        System.out.println("--------");

      //  data.forEach( s-> System.out.println(s));
       // data.stream().sorted().forEach(s-> System.out.println(s));

    }
}
