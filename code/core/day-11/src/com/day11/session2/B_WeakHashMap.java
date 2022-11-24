package com.day11.session2;
import java.util.*;
class Key{
    private int k;
    public Key(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Key{");
        sb.append("k=").append(k);
        sb.append('}');
        return sb.toString();
    }

}
public class B_WeakHashMap {
    public static void main(String[] args) throws Exception{
        //Noral map vs WeakHashMap
        Map<Key, String>map=new WeakHashMap<>();
        Key key=new Key(88);
        map.put(key,"88");
        key=null;
        System.gc();
        Thread.sleep(1000);

        System.out.println(map);

    }
}



