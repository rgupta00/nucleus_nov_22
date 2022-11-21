package com.lab7.sol;

public class DownloadManager {
	public static void download(String url) {
		System.out.println(Thread.currentThread().getName()+" is downloading "+ url);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" finished downloading "+ url);
	}
}
