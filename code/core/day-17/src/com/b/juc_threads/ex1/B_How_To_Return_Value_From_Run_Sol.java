package com.b.juc_threads.ex1;

class Cal implements Runnable {
	private int x, y, sum;
	volatile boolean isDone = false;

	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		sum = x + y;
		isDone = true;
		synchronized (this) {
			notifyAll();
		}
	}

	public int getSum() {
		if (!isDone) {
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}

public class B_How_To_Return_Value_From_Run_Sol {

	public static void main(String[] args) {
		Cal cal = new Cal(2, 1);
		Thread thread = new Thread(cal);
		thread.start();

		System.out.println(cal.getSum());

	}
}
