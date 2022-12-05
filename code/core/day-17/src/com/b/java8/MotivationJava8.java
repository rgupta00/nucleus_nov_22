package com.b.java8;

import java.util.stream.LongStream;

//calculating prime no bw 1 to 1_000_000
//can i create my own FI yes, can i use it into stream : yes
class Prime{
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}

public class MotivationJava8 {
	
	public static void main(String[] args) {
		//time taken: 674136070 ns: on single core
		//time taken: 278979469 ms: 4 cores
		//time taken: 340580256 ms: 2 core
		long start= System.nanoTime();
		long result= LongStream.rangeClosed(1, 1_000_0)
				.parallel()
				.filter(Prime::isPrime)
				.count();
		long end = System.nanoTime();
		System.out.println("time taken: "+ (end-start)+ " ms");


		
		/*
		 * System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 MotivationJava8

		 */
	}

}
