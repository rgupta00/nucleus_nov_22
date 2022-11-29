package com.day2.session1.ex2.juc_java5;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//BLocking queue

public class DemoBlockingQueue {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) {
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		producer.start();
		consumer.start();
	}

	protected static void consume() throws InterruptedException {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int val=queue.take();
			System.out.println("value taken from queue:"+ val+" size of queqe"+ queue.size());
		}
	}

	protected static void produce() throws InterruptedException {
		Random random = new Random();
		while (true) {
			queue.put(random.nextInt());
		}
	}
}
