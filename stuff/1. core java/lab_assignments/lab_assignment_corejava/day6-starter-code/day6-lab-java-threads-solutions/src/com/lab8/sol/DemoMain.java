package com.lab8.sol;

public class DemoMain {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		PurchageTask purchageTask1=new PurchageTask(productService, 111, 4);
		PurchageTask purchageTask2=new PurchageTask(productService, 111, 1);
		
		new Thread(purchageTask1,"amit").start();
		
		try {
			Thread.sleep(10);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		new Thread(purchageTask2,"sumit").start();
		
	}
}
