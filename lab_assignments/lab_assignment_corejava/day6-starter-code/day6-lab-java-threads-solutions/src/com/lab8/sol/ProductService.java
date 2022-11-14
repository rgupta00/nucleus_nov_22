package com.lab8.sol;

public class ProductService {

	public void purchase(Product product, int qty) {

		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " starting purchage " + product.getName());

			if (product.getQty() >= qty) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				product.setQty(product.getQty() - qty);

				System.out.println(Thread.currentThread().getName() + "has successfully purchage " + product.getName());
				System.out.println("remaining stock of "+ product.getName() + " is "+ product.getQty());
			}else {
				System.out.println("insufficient stock for :"+Thread.currentThread().getName());
			}
		}
	}
}
