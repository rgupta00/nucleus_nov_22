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
/*
Day 12:
quick revision :
collection
generics

annotation
java reflection


coming up:
----------


design pattern core java GOF

java 8 streams processing
Java 9 enhancement
java 10 enhancement
java 11-17 enhancement overview

data structure advance

jdbc
junit testing mockito


class Customer{
}

class Item{

}

class LineItem{

	private Item item;
	private int quantity;
	private double totalPrice;

}


class Cart{
	List<LineItem> list=new ....

}


Map<String, Cart>






















































 */









