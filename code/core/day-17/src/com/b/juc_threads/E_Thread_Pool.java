package com.b.juc_threads;

import java.util.concurrent.*;

class Factorial implements Callable<Long>{
	long n;
public Factorial(long n) {
	this.n = n;
}

@Override
public Long call() throws Exception {
	if (n < 0)
		throw new IllegalArgumentException("input correct value");
	long fact = 1;
	for (long i = 1; i <= n; i++) {
		fact *= i;
	}
	return fact;
}
}

public class E_Thread_Pool {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

		Callable<Long> task=new Factorial(20);
		ExecutorService executorService= Executors.newSingleThreadExecutor();
		Future<Long> future=executorService.submit(task);
		System.out.println(future.get());
		/*
			Different type of thread pool
			Fixed TP
			Cached TP
			Scheduled TP
			SingleThread Pool
		 */
	}
}











//class Factorial implements Callable<Long> {
//	long n;
//
//	public Factorial(long n) {
//		this.n = n;
//	}
//
//	@Override
//	public Long call() throws Exception {
//		if (n < 0)
//			throw new IllegalArgumentException("input correct value");
//		long fact = 1;
//		for (long i = 1; i <= n; i++) {
//			fact *= i;
//		}
//		return fact;
//	}
//
//}
