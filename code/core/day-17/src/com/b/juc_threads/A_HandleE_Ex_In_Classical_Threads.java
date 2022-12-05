package com.b.juc_threads;

import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;

class MyJob implements Runnable {

	@Override
	public void run() {
		// u can not throw checked ex...only trick is to wrap into unchecked ex and
		// throw

		if (1 == 1) {
			try {
				throw new IOException();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}

class MyDefaultExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("threads " + t.getName() + " ex " + e+" default one");
	}

}

class MyExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("threads " + t.getName() + " ex " + e);
	}

}

public class A_HandleE_Ex_In_Classical_Threads {

	public static void main(String[] args) {
		MyJob job = new MyJob();
		Thread thread = new Thread(job,"A");
		Thread thread2 = new Thread(job,"B");
		Thread.setDefaultUncaughtExceptionHandler(new MyDefaultExceptionHandler());
		// how to handle ex in classical threads:
		thread.setUncaughtExceptionHandler(new MyExceptionHandler());

		thread.start();
		thread2.start();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}
		System.out.println("end");
	}
}
