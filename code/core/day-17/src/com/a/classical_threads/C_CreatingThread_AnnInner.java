package com.a.classical_threads;

public class C_CreatingThread_AnnInner {

	public static void main(String[] args) {
			//can we use inner class in java


		Thread thread=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("job of the thread...");
			}
		},"A");
		thread.start();


//		Runnable runnable=new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("job of the thread...");
//			}
//		};
//		Thread thread=new Thread(runnable,"A");
//		thread.start();
	}

}
