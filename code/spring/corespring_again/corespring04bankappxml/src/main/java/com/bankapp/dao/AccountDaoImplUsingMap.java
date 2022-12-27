package com.bankapp.dao;

import com.bankapp.exeptions.BankAccountNotFoundExeption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDaoImplUsingMap implements AccountDao{

    private Map<Integer, Account> accounts=new HashMap<>();

    private int counter=2;

    public AccountDaoImplUsingMap(){
        accounts.put(1, new Account(1, "sumit", 1000.00));
        accounts.put(2, new Account(2, "amit", 1000.00));
    }
    @Override
    public List<Account> getAll() {
        System.out.println("getting all accoutns by using Map");
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Account getById(int id) {

        Account account= accounts.get(id);
        if(account==null)
            throw  new BankAccountNotFoundExeption("account with id : "+ id+" is not found");
        return account;
    }
    @Override
    public void updateAccount(Account account) {
        accounts.put(account.getId(), account);
    }

    @Override
    public void addAccount(Account account) {
        account.setId(++counter);
        accounts.put(counter, account);
    }

    @Override
    public void deleteAccount(int id) {
       Account accountToDelete=getById(id);
       accounts.remove(accountToDelete);
    }
}
