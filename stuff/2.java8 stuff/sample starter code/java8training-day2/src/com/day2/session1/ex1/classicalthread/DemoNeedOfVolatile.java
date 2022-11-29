package com.day2.session1.ex1.classicalthread;

import java.util.concurrent.TimeUnit;

public class DemoNeedOfVolatile {
	//volatile
	private static  boolean done=false;
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i=0;
				while(!done){
					i++;
				}
			}
		}).start();
		
		TimeUnit.SECONDS.sleep(1);
		done=true;
		System.out.println("flag set to true");
	}
}
