package com.day10.session1;
import java.util.*;
public class D_DemoMap {
    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        map.put("raj",90);
        map.put("ravi",70);
        map.put("sumit",92);
        map.put("amit",93);

        System.out.println(map);


      //  map.forEach((k, v)-> System.out.println(k+" : "+ v));
        System.out.println(map);
        //keyset vs entryset and java 8 streams
        //EntrySet is better in perforamance then keySet *
//        System.out.println("-------keyset----");
//        Set<String> keys=  map.keySet();
//        for (String key: keys){
//            System.out.println(key+" : "+ map.get(key));
//        }

//        System.out.println("-------entryset----");
//        Set<Map.Entry<String, Integer>>entrySet= map.entrySet();//K, V
//
//        Iterator<Map.Entry<String, Integer>> it=entrySet.iterator();
//        while (it.hasNext()){
//            Map.Entry<String, Integer> entry= it.next();
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
//        }

//        for (Map.Entry<String, Integer> entry: entrySet){
//            System.out.println(entry.getKey()+" : "+ entry.getValue());
//        }



        //What happen if we are not using genricew and putting un compatable type : CCEx
//        Map map=new TreeMap();
//        map.put("raj",90);
//        map.put("ravi",70);
//        map.put("sumit",92);
//        map.put("amit",93);
//        //map.put(null,89);
//        map.put(new StringBuffer("raj"),99);//Why null as key is allowed?
//        System.out.println(map);







        //hashtable vs HashMap




//        Map<String, Integer> map=new Hashtable<>();
//        map.put("raj",90);
//        map.put("ravi",70);
//        map.put("sumit",92);
//        map.put("amit",93);
//        map.put("foo",null);
//
//        //how to print map
        //System.out.println(map);


    }
}
