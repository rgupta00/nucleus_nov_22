package com.bankapp.dao.impl;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.*;
// <bean id="accountDao1" class="com.bankapp.dao.impl.AccountDaoImplMap" primary="true"/>
@Repository(value = "accountDao1")
@Primary
//@Profile("dev")
public class AccountDaoImplMap implements AccountDao {
    private Map<Integer, Account> accounts=new HashMap<>();
    public AccountDaoImplMap(){
        accounts.put(1, new Account(1, "sumit", 1000.00));
        accounts.put(2, new Account(2, "amit", 1000.00));
    }
    @Override
    public List<Account> getAll() {
        System.out.println("get all account using hashmap");
        return new ArrayList<Account>(accounts.values());
    }

    @Override
    public Account updateAccount(Account account) {
       return accounts.put(account.getId(), account);
    }

    @Override
    public Account getById(int id) {
        return accounts.get(id);
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public void deleteAccount(int id) {

    }
}
