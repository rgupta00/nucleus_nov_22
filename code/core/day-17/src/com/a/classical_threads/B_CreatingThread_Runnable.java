package com.a.classical_threads;
// U can use Thread itself

class MyThread extends Thread{
	public void run(){
		System.out.println("job of the thread...");
	}
}
public class B_CreatingThread_Runnable {
	
	public static void main(String[] args) {
		Thread thread=new Thread("a");
		thread.start();
		System.out.println("--------------");
//		MyThread thread=new MyThread();
//		thread.start();
	}

}
