package com.lab3.sol;

import java.util.concurrent.TimeUnit;

/**
 * Lanunch the PrimeGenerator, waits five seconds and interrupts the Thread
 */
public class Main {

	public static void main(String[] args) {

		// Launch the prime numbers generator
		Thread task = new PrimeGenerator();
		task.start();
		// Wait 5 seconds
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Interrupt the prime number generator : ****write the code****
		//task.interrupt();
	}

}