package com.bankapp.service;
//SL=BL+CCC
import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.service.anno.MyAppLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;


    @Autowired
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> getAll() {
        return accountDao.getAll();
    }

    @Override
    public Account getById(int id) {
        return accountDao.getById(id);
    }

    @MyAppLogging
    @Override
    public void transfer(int fromAccId, int toAccId, double amount) {

        Account fromAcc=accountDao.getById(fromAccId);
        Account toAcc=accountDao.getById(toAccId);

        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);

        accountDao.updateAccount(fromAcc);
        accountDao.updateAccount(toAcc);

    }

    @Override
    public void deposit(int accId, double amount) {
        Account acc=accountDao.getById(accId);
        acc.setBalance(acc.getBalance()+amount);
        accountDao.updateAccount(acc);
    }

    @Override
    public void withdraw(int accId, double amount) {
        Account acc=accountDao.getById(accId);
        acc.setBalance(acc.getBalance()-amount);
        accountDao.updateAccount(acc);
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