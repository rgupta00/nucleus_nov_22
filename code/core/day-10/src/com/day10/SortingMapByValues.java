package com.day10;
import java.util.*;
class Key{
    int i;
    public Key(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Key{");
        sb.append("i=").append(i);
        sb.append('}');
        return sb.toString();
    }
}
public class SortingMapByValues {
    public static void main(String[] args) {
        Map<Key, Integer> map=new HashMap<>();
        map.put(new Key(55),55);
        map.put(new Key(855),855);
        map.put(new Key(505),505);
        map.put(new Key(51),51);
//
//
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Key::getI)))
//                .forEach(e-> System.out.println(e.getKey()+": "+ e.getValue()));

//        Map<String, Integer> map=new HashMap<>();
//        map.put("foo",55);
//        map.put("raj",85);
//        map.put("ekta",59);
//        map.put("sumit",95);
//
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(e-> System.out.println(e.getKey()+": "+ e.getValue()));
    }
}
