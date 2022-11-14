package com.lab7.sol;

public class FileDownloadTask implements Runnable {
	private String url;

	public FileDownloadTask(String url) {
		this.url = url;
	}
	@Override
	public void run() {
		DownloadManager.download(url);
	}
}
