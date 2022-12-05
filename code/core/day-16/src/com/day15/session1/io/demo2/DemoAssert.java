package com.day15.session1.io.demo2;
//What is assert
class Account{
    private int id;
    private String name;
    private Double amount;
    private String atmCartSripNo;

    public Account(int id, String name, Double amount, String atmCartSripNo) {
        //some valutation
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.atmCartSripNo = atmCartSripNo;
    }
    public boolean withdarawMoneywithAtmCard(String atmCartSripNo){
        //
        withdarawMoneyFromAccount(atmCartSripNo);
        return true;
    }

    private void withdarawMoneyFromAccount(String atmCartSripNo) {
        //
        System.out.println("before");
        //disable ea
        assert atmCartSripNo.length()==16:"invalid state";
        System.out.println("afer ");
    }
}

public class DemoAssert {
    public static void main(String[] args) {

        Account a=new Account(1,"raj",5600.0,
                "3355116632127");

        a.withdarawMoneywithAtmCard("3355116632127");
        System.out.println("End");
    }


}
