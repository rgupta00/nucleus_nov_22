package com.lab7.sol;
import java.util.*;

public class DemoThread2 {
	public static void main(String[] args) {
		List<String> photoUrl=FileUtil.readFile("data.txt");
		
		for(String url: photoUrl) {
			FileDownloadTask downloadTask=new FileDownloadTask(url);
			Thread thread=new Thread(downloadTask);
			thread.start();
		}
	}
}
