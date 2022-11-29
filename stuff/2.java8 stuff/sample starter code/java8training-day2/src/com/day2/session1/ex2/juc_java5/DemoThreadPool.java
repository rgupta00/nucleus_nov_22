package com.day2.session1.ex2.juc_java5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Factorial implements Callable<Long> {
	private long x;

	public Factorial(long x) {
		this.x = x;
	}


	@Override
	public Long call() throws Exception {
		long result=1;
		if(x<1)
			throw new IllegalArgumentException();
		else if(x==1)
			return 1L;
		else{
			for(long l=2; l<=x; l++){
				result=result*l;
			}
		}
		return result;
	}

}

public class DemoThreadPool {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex=Executors.newCachedThreadPool();
		Future<Long> submit = ex.submit(new Factorial(5));
		//ex.shutdown();
		long val=submit.get();// blocking
		System.out.println(val);
	}

}
