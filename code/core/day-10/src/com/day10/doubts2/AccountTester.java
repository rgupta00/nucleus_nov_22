package com.day10.doubts2;

public class AccountTester {
    public static void main(String[] args) {
        try{
            Account a=new Account(1,"raj",8000);
            //a.balance=1000000;
            System.out.println(a);
            System.out.println(a.getId());
        }catch (AccountCreationExeption e){
            System.out.println(e.getMessage());
        }
    }
}
