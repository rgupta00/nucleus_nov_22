package com.day2.session1.ex1.classicalthread;

class Printer{
	public  void print(String letter){
		System.out.print("[");
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){}
		System.out.println(letter + "]");
	}
}
class Client extends Thread{
	private Thread thread;
	private Printer printer;
	private String letter;
	
	public Client(Printer printer, String letter){
		this.printer=printer;
		this.letter=letter;
		thread=new Thread(this);
		thread.start();
	}
	public void run(){
		printer.print(letter);
	}
}
public class NeedOfSyn {
	
	public static void main(String[] args) {
		
		Printer printer=new Printer();
		Client client1=new Client(printer, "i love java");
		Client client2=new Client(printer, "i hate java");
		Client client3=new Client(printer, "i love india");
		
	}

}
