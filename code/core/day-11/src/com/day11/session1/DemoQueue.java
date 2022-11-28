package com.day11.session1;
import  java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DemoQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(1);
        queue.add(66);
        queue.add(55);
//        queue.offer(44);
//        queue.offer(4);
        //queue.offer(44);
      //  System.out.println(queue.remove());
        System.out.println("=--------");
    }
}
