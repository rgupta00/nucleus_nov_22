package com.lab3;

public class PrimeGenerator extends Thread {
	@Override
	public void run() {
		long number = 1L;
		// This loop never ends... until is interrupted
		while (true) {
			if (isPrime(number)) {
				System.out.printf("Number %d is Prime\n", number);
			}

			// When is interrupted, write a message and ends
			if (isInterrupted()) {
				
			}
			number++;
		}
	}

	/**
	 * Method that calculate if a number is prime or not
	 */
	private boolean isPrime(long number) {
		if (number <= 2) {
			return true;
		}
		for (long i = 2; i < number; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}

}