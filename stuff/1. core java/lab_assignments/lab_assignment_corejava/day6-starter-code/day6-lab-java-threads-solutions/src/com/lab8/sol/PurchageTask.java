package com.lab8.sol;

public class PurchageTask implements Runnable{
	private ProductService productService;
	private int productId;
	private int qty;

	public PurchageTask(ProductService productService, int productId, int qty) {
		this.productService = productService;
		this.productId = productId;
		this.qty = qty;
	}
	@Override
	public void run() {
		try {
			Product product=ProductRepo.getProduct(productId);
			productService.purchase(product, qty);
		}catch(ProductNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
