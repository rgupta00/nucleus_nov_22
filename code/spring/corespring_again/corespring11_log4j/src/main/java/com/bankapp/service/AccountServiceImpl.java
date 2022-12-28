package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImplUsingJdbc;
import com.bankapp.dao.AccountDaoImplUsingMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{

    private Logger logger=LogManager.getLogger(AccountServiceImpl.class);

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

    @Override
    public void transfer(int fromAccId, int toAccId, double amount) {
        long start=System.currentTimeMillis();
        Account fromAcc=accountDao.getById(fromAccId);
        Account toAcc=accountDao.getById(toAccId);

        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);

        accountDao.updateAccount(fromAcc);
        accountDao.updateAccount(toAcc);

       logger.info("fund is transfred from acc to another");

        long  end=System.currentTimeMillis();
        logger.info("time taken to ex tranfer method is : "+ (end-start));
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
