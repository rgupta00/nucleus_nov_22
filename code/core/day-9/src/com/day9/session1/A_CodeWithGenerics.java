package com.day9.session1;

import java.util.*;

public class A_CodeWithGenerics {
    public static void main(String[] args) {
        //<String>: is called generics used to privide type safty to our code
        List<String> list=new ArrayList<>();

        list.add("foo");
        list.add("bar");
        list.add("jar");
        list.add("car");

        System.out.println(list);


        //enhace for loop
        //iteator, how it work, iteatror dp works*
        //algo: sort , bs


        //BS: pre condiation data should be sorted
        /*
        [bar, car, foo, jar]
            -3
         */
//        int index=Collections.binarySearch(list,"foo");
//        System.out.println(index);

        //Collection api: data + str+ algo


        //now we want to use iteator
        //What are 3 cursor in java: enumation(vector), ListIetator, Iterator(Univaral cursor)
        /*
            enumation(vector): for lagacy app, it can only iterate
            Iterator(Univaral cursor): can do 2 things iterate ,and delete
            ListIetator(most powerful) : u can even do crud opation and move back and forth

         */
//        Iterator<String> it=list.iterator();
//        while (it.hasNext()){
//            it.next();
//            it.remove();
//        }
//        System.out.println(list);



        //how to iterate this arraylist
        //enhace for loop: syntex suger => itera
//        for (String data: list){
//            System.out.print(data+" , ");
//        }



        //System.out.println(list);

        //System.out.println(list.get(-1));//O(1)


    }

}
