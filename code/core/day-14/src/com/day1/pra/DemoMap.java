package com.day1.pra;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<String, Integer>();
        map.put("raj",90);
        map.put("amit",89);
        map.put("ekta",87);
        map.put("seema",97);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach( e -> System.out.println(e.getKey()+" : "+ e.getValue()));
    }
}








