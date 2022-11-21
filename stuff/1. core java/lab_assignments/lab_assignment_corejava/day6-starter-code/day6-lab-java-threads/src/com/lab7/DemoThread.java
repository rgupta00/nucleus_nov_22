package com.lab7;
import java.util.*;
public class DemoThread {
	public static void main(String[] args) {
		List<String> photoUrl=FileUtil.readFile("data.txt");
		
		for(String url: photoUrl) {
			DownloadManager.download(url);
		}
	}
}
