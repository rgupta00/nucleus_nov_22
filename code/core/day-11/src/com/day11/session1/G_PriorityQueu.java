package com.day11.session1;
import java.util.*;
public class G_PriorityQueu {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        pq.offer(33);
        pq.offer(3);
        pq.offer(303);
        pq.offer(3443);

//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }


//        for (Integer temp: pq){
//            System.out.println(temp);
//        }

//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());




       // System.out.println(pq.remove());




        //how to add data to priority Que
        //how to remove it
        //how to print it
    }
}
