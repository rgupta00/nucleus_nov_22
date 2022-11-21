package com.lab8.sol;

public class ProductRepo {

	private static Product[] products;
	
	static {
		products=new Product[3];
		products[0]=new Product(111	,"effective java", 300, 4);
		products[1]=new Product(181	,"dell laptop", 50000, 2);
		products[2]=new Product(11	,"laptop mouse", 500, 5);
	}
	
	public static Product getProduct(int productId) throws ProductNotFoundException {
		for(Product product: products) {
			if(product.getId()==productId) {
				return product;
			}
		}
		throw new ProductNotFoundException("product with id " + productId +" is not found");
	}
}
