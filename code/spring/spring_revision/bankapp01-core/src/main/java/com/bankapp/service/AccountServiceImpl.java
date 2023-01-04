package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.impl.AccountDaoImplJdbc;
import com.bankapp.dao.impl.AccountDaoImplMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
//<bean id="accountService" class="com.bankapp.service.AccountServiceImpl" autowire="byType">
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{
    private  AccountDao accountDao;

    @Autowired      //byType or byName
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> getAll() {
        return accountDao.getAll();
    }

    @Override
    public void transfer(int fromId, int toId, double amount) {
        Account fromAcc=accountDao.getById(fromId);
        Account toAcc=accountDao.getById(toId);
        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);
        accountDao.updateAccount(fromAcc);
        accountDao.updateAccount(toAcc);
    }

    @Override
    public void deposit(int id, double amount) {
        Account acc=accountDao.getById(id);
        acc.setBalance(acc.getBalance()+amount);
    }

    @Override
    public void withdraw(int id, double amount) {
        Account acc=accountDao.getById(id);
        acc.setBalance(acc.getBalance()-amount);
    }

    @Override
    public Account getById(int id) {
        return accountDao.getById(id);
    }

    @Override
    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }
}
