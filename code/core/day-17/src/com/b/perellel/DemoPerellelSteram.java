package com.b.perellel;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class DemoPerellelSteram {

    /*
        time taken: 10850414 ms Sequ
        time taken: 20395201 mss

        */
    public static void main(String[] args) {
        //sum from 1 to 100_000
        long start=System.nanoTime();

        //Accumatation is big no in case of || streams

      //  long sum[]=new long[]{0};
        AtomicLong sum = new AtomicLong(0);//CAS vs syn
        LongStream.rangeClosed(1, 100_000)
                .parallel()
                .forEach( i -> sum.addAndGet(i));

        System.out.println(sum);
        //You should always use reducer if ur using || streams

        long sum2=LongStream.rangeClosed(1,100_0000)
                .parallel()
                 .reduce(0, ( x,  y)-> x+y);//sum is shortcut of reduce operation
//
//        System.out.println(sum);

        long end=System.nanoTime();
        System.out.println("time taken: "+(end-start)+ " ms");


//        long sum= LongStream.rangeClosed(1,100_000).parallel().reduce(0,( x,  y) ->x+y);
//        System.out.println(sum);

    }
}
