package com.day10.doubts2;
//ab encapsulation = data hiding + BC
class AccountCreationExeption extends Exception{
    public AccountCreationExeption(String message){
        super(message);
    }
}
class NotSufficentFundException extends Exception{
    public NotSufficentFundException(String message){
        super(message);
    }
}
class OverFundException extends Exception{
    public OverFundException(String message){
        super(message);
    }
}

public class Account {
   private int id;
    private String name;
    private double balance;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Account(int id, String name, double balance)throws AccountCreationExeption{
        this.id=id;
        this.name=name;
        this.balance=balance;
        if(balance<1000)
            throw  new AccountCreationExeption("account can not be create with amount");
    }
    //1K
    public void withdraw(double amount)throws NotSufficentFundException{
        double temp=balance-amount;
        if(temp<1000)
            throw  new NotSufficentFundException(" min balane should be 1K always");
        balance=temp;
    }
    //20L
    public void deposit(double amount)throws OverFundException{
        double temp=balance+amount;
        if(temp<2000_000)
            throw  new OverFundException(" pls open current account");
        balance=temp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}













