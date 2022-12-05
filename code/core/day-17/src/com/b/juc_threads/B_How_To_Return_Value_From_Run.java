package com.b.juc_threads;

class Cal implements Runnable{
	private int x, y,sum;

	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		sum=x+y;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
public class B_How_To_Return_Value_From_Run {

	public static void main(String[] args) {
		Cal cal =new Cal(2, 1);
		Thread thread=new Thread(cal);
		thread.start();
		
		System.out.println(cal.getSum());
		
	}
}
