package com.day11.session3;

import com.day11.common.Employee;

import java.util.*;

//A : arrayList             B: LinkeList
//class ProductStoreV2{
//    private String storeName;
//    private Product[] products;
//
//    public ProductStoreV2(String storeName) {
//        this.storeName = storeName;
//        this.products=new Product[10];
//    }
//
//    public String getStoreName() {
//        return storeName;
//    }
//
//    public Product[] getProducts() {
//        return products;
//    }
//
//    public void addProducts(Product product) {
//        this.products.add(product);
//    }
//}

class ProductStore implements Iterable<Product>{
    private String storeName;
    private List<Product> products;

    public ProductStore(String storeName) {
        this.storeName = storeName;
        this.products=new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new MyIterator();
    }

    class MyIterator implements  Iterator<Product>{
        int counter=0;
        @Override
        public boolean hasNext() {
            return counter<products.size();
        }

        @Override
        public Product next() {
            return products.get(counter++);
        }

        @Override
        public void remove() {
           products.remove(counter--);
        }
    }
}
class Product{
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
public class A_ImplementationOfIteratorPattern {
    public static void main(String[] args) {

        ProductStore productStore=new ProductStore("rel fresh");
        /// public Product(int id, String name, double price)
        productStore.addProducts(new Product(1,"bread",88.9));
        productStore.addProducts(new Product(19,"makahan",88.9));
        productStore.addProducts(new Product(177,"jeera",88.9));


        Iterator<Product> it=productStore.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
