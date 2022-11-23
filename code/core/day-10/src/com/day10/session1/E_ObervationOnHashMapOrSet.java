package com.day10.session1;
import  java.util.*;
 final class Key implements Comparable<Key>{
   final private  int k;

    public Key(int k) {
        this.k = k;
    }

     public int getK() {
         return k;
     }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Key key = (Key) o;

        return k == key.k;
    }

    @Override
    public int hashCode() {
        return  k;
    }

     @Override
     public int compareTo(Key o) {
         return Integer.compare(this.getK(), o.getK());
     }

     @Override
     public String toString() {
         final StringBuilder sb = new StringBuilder("Key{");
         sb.append("k=").append(k);
         sb.append('}');
         return sb.toString();
     }
 }
public class E_ObervationOnHashMapOrSet {
    public static void main(String[] args) {

        Map<Key, String>map=new TreeMap<>(new Comparator<Key>() {
            @Override
            public int compare(Key o1, Key o2) {
                return Integer.compare(o2.getK(), o1.getK());
            }
        });
        map.put(new Key(55),"fifty file");
        map.put(new Key(6),"six");
        //System.out.println(map);

        Set<Map.Entry<Key, String>>entrySet=   map.entrySet();
        for (Map.Entry<Key, String> entry: entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

//        Key k1=new Key(66);
//        Key k2=new Key(66);
//        System.out.println(k1.equals(k2));
//        System.out.println(k1.hashCode());
//        System.out.println(k2.hashCode());

//        System.out.println(k1.equals(k2));
//        System.out.println(k1.hashCode()==k2.hashCode());
//        System.out.println(k1.hashCode());

        //GPP: if u are using k (user define object ) better that object must be immutable

//        Key key=new Key(5);
//        Map<Key, String>map=new HashMap<>();
//        map.put(key,"five");
//        //key.setK(6666);
//        System.out.println(map.containsKey(key));

    }
}
