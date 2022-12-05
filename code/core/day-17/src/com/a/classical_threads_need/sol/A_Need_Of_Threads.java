package com.a.classical_threads_need.sol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

//-----to read details of file to downlaod----
class FileUtil {
	public static List<String> readFile(String fileName) {
		List<String> lines = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
}
// file donwload manager 

class DownloadManager {
	public static void download(String url) {
		System.out.println(Thread.currentThread().getName() + " is downloading " + url);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		System.out.println(Thread.currentThread().getName() + " finished downloading " + url);
	}
}

class FileDownloaderTask implements Runnable {

	private String url;

	public FileDownloaderTask(String url) {
		this.url = url;
	}

	@Override
	public void run() {
		DownloadManager.download(url);
	}

}

public class A_Need_Of_Threads {

	public static void main(String[] args) {
		List<String> photoUrl = FileUtil.readFile("data.txt");
		for (String url : photoUrl) {
			FileDownloaderTask downloaderTask = new FileDownloaderTask(url);
			Thread thread=new Thread(downloaderTask);
			thread.start();
		}
	}
}
