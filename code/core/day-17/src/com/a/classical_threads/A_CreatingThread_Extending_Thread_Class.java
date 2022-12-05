package com.a.classical_threads;
//Job and worker analogy 
//Thread and Runnable
//how os manage differ process, threads
//how to create our own threds?
//1.Thread
//2. Runnable
//Act as job
class MyJob implements Runnable{
	@Override
	public void run() {
		System.out.println("job of the thread: "+Thread.currentThread().getName());
	}
}

public class A_CreatingThread_Extending_Thread_Class {
	public static void main(String[] args) {
		System.out.println("start "+Thread.currentThread().getName());
		MyJob job=new MyJob();

		Thread thread=new Thread(job,"A");
		thread.setPriority(Thread.MAX_PRIORITY);
		Thread thread2=new Thread(job,"B");
		Thread thread3=new Thread(job,"C");

		//thread.run();// never ever call run direct
		thread.start();
		thread2.start();
		thread3.start();

		//thread2.start();// you should not start a thread twice?
		try {
			thread.join();//Join afer me
			thread2.join(1000);
			thread3.join(1000,12000);
		}catch (InterruptedException ex){}

		System.out.println("end "+Thread.currentThread().getName());

	}

}
