package com.day6.session1.ex2;
/*
    Account : 1K
    deposit: 15L
    withdraw: 1K
 */
class AccountCreationException extends Exception{
    public AccountCreationException(String message){
        super(message);
    }
}
class NotSufficientFundException extends Exception{
    public NotSufficientFundException(String message){
        super(message);
    }
}
class OverFundException extends Exception{
}
class Account{
    public int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance)throws AccountCreationException{
        this.id = id;
        this.name = name;
        this.balance = balance;
        if (balance<1000)
           throw new AccountCreationException("accont can not b create with balance of "+ balance);
    }

    public  void withdarw(double amount) throws NotSufficientFundException{
        double temp= amount-balance;
        if(temp<=1_000){
            throw new NotSufficientFundException("min balace at any time must be 1k");
        }
        balance=temp;
    }

    public  void deposit(double amount){
        double temp= amount+ balance;
        if(temp>150_00_00){

        }
        balance=temp;
    }
    public  void printAccountDetails(){
        System.out.println(" id : "+ id);
        System.out.println(" name: "+ name);
        System.out.println("balance "+ balance);
    }
}
public class I_UserDefineUncheckedEx {
    public static void main(String[] args) {


        Account a  =new Account(1,"raj",5000);
          a.printAccountDetails();
          a.withdarw(4900);


    }
}
