package com.b.juc_threads;

import java.util.Iterator;
import java.util.Vector;

public class MyThread extends Thread{

	static Vector<String> list=new Vector<>();
	@Override
	public void run() {
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e){}
		list.add("D");
	}

	public static void main(String[] args) throws InterruptedException{
		/*
		 * Traditinal collection AL,LL, HM are mutable and not thread safe
		 * How to return copy
		 * 
		 * How to make syn	: Collections.synchr..List() performance problem
		 * java 5: CHM, CopyonWiteArrayList  : ConcurrnetModficicationException
		 * 
		 */
		list.add("A");
		list.add("B");
		list.add("C");

		MyThread thread=new MyThread();
		thread.start();

		Iterator<String> it=list.iterator();
		while (it.hasNext()){
			System.out.println("thread iterating: "+ it.next());
			Thread.sleep(1000);
		}




	}
}
