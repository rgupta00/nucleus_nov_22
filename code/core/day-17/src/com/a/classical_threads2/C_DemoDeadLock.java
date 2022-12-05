package com.a.classical_threads2;

public class C_DemoDeadLock {
	public static void main(String[] args) {
		final Object resource1 = "bat";
		final Object resource2 = "ball";

		// Thread dump analysis: jps -l
		//jstack pid> dump.txt
		//jconsole

		Thread thread1=new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (resource1){
					System.out.println("t1 got lock on r1");
					try{
						Thread.sleep(100);
					}catch (InterruptedException e){}
					synchronized (resource2){
						System.out.println("t1 got lock on r2");
					}
				}
			}
		});

		Thread thread2=new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (resource1){
					System.out.println("t2 got lock on r1");
					try{
						Thread.sleep(100);
					}catch (InterruptedException e){}
					synchronized (resource2){
						System.out.println("t2 got lock on r2");
					}
				}
			}
		});

		thread1.start();
		thread2.start();
		System.out.println("-----------");
	}

}
