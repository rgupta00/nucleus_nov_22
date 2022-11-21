package com.lab4.sol;

public class Main {

	/**
	 * Main method of the example. Initialize a Thread to process the uncaught
	 * exceptions and starts a Task object that always throws an exception
	 */
	public static void main(String[] args) {
		Task task = new Task();
	
		Thread thread = new Thread(task);

		thread.setUncaughtExceptionHandler(new ExceptionHandler());
		
		thread.start();

		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.printf("Thread has finished\n");

	}

}