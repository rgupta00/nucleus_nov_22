package com.day11.session2;
import com.day11.common.Employee;

import java.util.*;
public class D_NeedOfGenerics {
    public static void main(String[] args) {

        //Generics 1.5 is type erassed? compile time funda
        //polymorphic behavior is not shown
        List<Integer> list=new ArrayList<>();
        list.add(55);
        list.add(5);
        list.add(550);

        System.out.println("---for int-----");
        printMe(list);

        List<Double> list2=new ArrayList<>();
        list2.add(55.99);
        list2.add(5.00);
        list2.add(550.00);

        System.out.println("---for double-----");
        printMe(list2);

        List<Employee> list3=new ArrayList<>();
       list3.add(new Employee(1,"raj",5000));
        list3.add(new Employee(81,"raj",5000));

        printMe(list3);

    }
    //<? extends XX>
    //<? super XX>
    //u can print it but change it
    //<? extends Object> vs <?>
    private static void printMe(List<? extends Object> list) {
       // list.add(666.00);
        for(Object data: list){
            System.out.println(data);
        }
    }

}
