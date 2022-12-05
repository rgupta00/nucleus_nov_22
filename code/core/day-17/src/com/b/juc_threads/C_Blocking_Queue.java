package com.b.juc_threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//BlockingQueue ise mordern ways to solve P and C
public class C_Blocking_Queue {

	private static BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) {
		// create producer thread
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		// consumer threads
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		thread1.start();
		thread2.start();
	}

	protected static void consumer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(100);
			if (random.nextInt(10) == 0) {
				Integer val=blockingQueue.take();
				System.out.println("taken "+ val+" size :" +blockingQueue.size());
			}
		}
	}

	protected static void produce() throws InterruptedException {
		Random random = new Random();
		while (true) {
			blockingQueue.put(random.nextInt(100));
		}
	}
}
