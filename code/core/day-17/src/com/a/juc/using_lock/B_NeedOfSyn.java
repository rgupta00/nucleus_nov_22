package com.a.juc.using_lock;
//A printer is shared bw multiple client [ i love java]

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Printer{
	//synchronized method vs synchronized block
	private Lock lock=new ReentrantLock(true);
	public  void print(String letter){
		//
		//
			try{
				lock.lock();
				System.out.print("[");
				try{
					Thread.sleep(1000);
				}catch (InterruptedException ex){}
				System.out.println(letter +"]");
			}finally {
				lock.unlock();
			}
		//
		//
	}
}
class Client extends Thread{
	private Printer printer;
	private String letter;
	private Thread thread;
	public Client(Printer printer, String letter){
		this.printer=printer;
		this.letter=letter;
		this.thread=new Thread(this);
		this.thread.start();
	}
	@Override
	public void run(){
		printer.print(letter);
	}
}
public class B_NeedOfSyn {
	
	public static void main(String[] args) {
		Printer printer=new Printer();
		Client raj=new Client(printer,"i love java");
		Client amit=new Client(printer,"i hate java");
		Client ekta=new Client(printer,"i love flowers");


		//System.out.println("End");

		
	}

}
