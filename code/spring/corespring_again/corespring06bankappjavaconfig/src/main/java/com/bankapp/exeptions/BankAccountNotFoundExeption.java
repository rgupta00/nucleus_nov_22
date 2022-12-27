package com.bankapp.exeptions;

public class BankAccountNotFoundExeption extends RuntimeException{

    public BankAccountNotFoundExeption(String message) {
        super(message);
    }
}
