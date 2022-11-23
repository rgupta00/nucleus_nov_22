package com.day10.session2;
import java.util.*;
public class ShoppingList {
    public static void main(String[] args) {
    //Customer --> many products
        Map<Customer, List<Product>> map=new HashMap<>();
        Customer c1=new Customer(1,"raja");
        List<Product> productList1=Arrays.asList(
                new Product(122,"Acer i5",79000,6700),
                new Product(12,"Acer i7",179000,34700)
                );

        Customer c2=new Customer(66,"tarun");
        List<Product> productList2=Arrays.asList(
                new Product(177,"Coolpad",1700,300),
                new Product(12,"paint brush",700,100)
        );

        map.put(c1, productList1);
        map.put(c2, productList2);

        Set<Map.Entry<Customer, List<Product>>>entrySet=  map.entrySet();
        for (Map.Entry<Customer, List<Product>> entry: entrySet){
            System.out.println(entry.getKey()+": ");
            List<Product> productList=entry.getValue();
            for (Product product: productList){
                System.out.println(product);
            }

        }


    }
}
