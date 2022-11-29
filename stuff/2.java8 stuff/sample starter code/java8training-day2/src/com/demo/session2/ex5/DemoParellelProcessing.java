package com.demo.session2.ex5;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;

public class DemoParellelProcessing {
	
	public static void main(String[] args) {
		//500000500000
		//using external iteration
		long sum=0;
		for(long i=0;i<=1_000_000;i++){
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		//using stream=> work with sequetial stream not with parellel stream why?
		long []sum2=new long[]{0L};
		 
		LongStream.rangeClosed(1, 1_000_000).parallel().forEach(i->sum2[0]+=i);
			 
		System.out.println(sum2[0]);

		//Using atomicLong , what about performance?
		
		AtomicLong sum3=new AtomicLong(0L);
		
		 LongStream.rangeClosed(1, 1_000_000).parallel()
			.forEach(i->sum3.addAndGet(i));
		 
		 System.out.println(sum3);

		
		//accumulation vs reduction
		 
		 long sum4=LongStream.rangeClosed(1L, 1_000_000)
					.parallel()
						.reduce(0, (x,y)->x+y);
		

		System.out.println(sum4);

		
		
	}

}
