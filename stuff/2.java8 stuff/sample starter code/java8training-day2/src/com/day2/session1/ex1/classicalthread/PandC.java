package com.day2.session1.ex1.classicalthread;

/*
 class Q {
 int i;
 private boolean valueSet = false;

 public synchronized int get() {
 while (!valueSet) {
 try {
 wait();
 } catch (InterruptedException e) {
 }
 }
 System.out.println("got: " + i);
 valueSet = false;
 notifyAll();
 return i;
 }

 public synchronized void put(int i) {
 while (valueSet) {
 try {
 wait();
 } catch (InterruptedException e) {
 }
 }
 System.out.println("put : " + i);
 this.i = i;
 valueSet=true;
 notifyAll();
 }
 }*/

class Q {
	int i;

	public int get() {
		System.out.println("got: " + i);
		return i;
	}

	public void put(int i) {
		System.out.println("put : " + i);
		this.i = i;
	}
}

class Produer implements Runnable {
	private Q q;

	public Produer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}

}

class Consumer implements Runnable {
	private Q q;

	public Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			q.get();
		}
	}

}

public class PandC {

	public static void main(String[] args) {
		Q q = new Q();
		Produer produer = new Produer(q);
		Consumer consumer = new Consumer(q);
	}

}
