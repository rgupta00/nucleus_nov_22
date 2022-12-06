package com.b.juc_threads;

import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
//Q. can we throw ex from run() method
class MyJob implements Runnable {
	@Override
	public void run() {
		if (1 == 1) {
			try {
				throw new IOException();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}




public class A_HandleE_Ex_In_Classical_Threads {

	public static void main(String[] args) {
		MyJob job = new MyJob();
		Thread thread = new Thread(job,"A");

		thread.setUncaughtExceptionHandler(( t,  e)->
				System.out.println("thread got some ex "+ e.toString())
		);
		//for that we need to apply event hander


			thread.start();


		System.out.println("end");
	}
}
