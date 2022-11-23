package com.day8.doubts;
import  java.util.*;
public class Bank {
    private List<Customer> customers=new ArrayList<>();
    public void registerCustoemr(Customer customer){
        customers.add(customer);
    }
}
