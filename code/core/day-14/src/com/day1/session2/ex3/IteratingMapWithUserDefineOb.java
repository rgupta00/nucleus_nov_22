package com.day1.session2.ex3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import  static java.util.Comparator.*;
class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;


    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
//https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#axzz7mC957T1M
public class IteratingMapWithUserDefineOb {
    public static void main(String[] args) {

        //biConsumer
        Map<Product, Double> map=new HashMap<>();
        map.put(new Product(77,"cool pad",900.00),2.6);
        map.put(new Product(1,"laptop",78000.00),4.5);


//      map.entrySet()
//              .stream()
//              .sorted(Map.Entry.comparingByKey(( o1,  o2)->
//                      Double.compare(o2.getPrice(), o1.getPrice())))
//              .forEach(e-> System.out.println(e.getKey()+" : "+ e.getValue()));


        Comparator<Product> comparator=
                Comparator.comparing(Product::getPrice).reversed();

        //how to do it with method ref
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey( comparing(Product::getPrice).reversed()))
                .forEach(e-> System.out.println(e.getKey()+" : "+ e.getValue()));



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
//        map.entrySet()
//                .stream()
////                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
//                .forEach( e -> System.out.println(e.getKey()+" : "+ e.getValue()));




    }
}
