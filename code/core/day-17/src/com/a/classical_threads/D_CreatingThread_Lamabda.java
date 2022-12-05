package com.a.classical_threads;

public class D_CreatingThread_Lamabda {
	public static void myFoo(){
		System.out.println("my foo method ");
	}
	public static void main(String[] args) {
//		Thread thread=new Thread(()-> System.out.println("job of the thread..."),"A");
		Thread thread=new Thread(D_CreatingThread_Lamabda::myFoo,"A");
		thread.start();
	}

}
