package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.impl.AccountDaoImplJdbc;
import com.bankapp.dao.impl.AccountDaoImplMap;
import com.bankapp.exceptions.AException;
import com.bankapp.exceptions.BException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "accountService")
@Transactional(readOnly = true, timeout = 3)
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

    //noRollbackFor = {AException.class}, rollbackFor = BException.class
    @Transactional()
    @Override
    public void transfer(int fromId, int toId, double amount) {
        Account fromAcc=accountDao.getById(fromId);
        Account toAcc=accountDao.getById(toId);
        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);
        accountDao.updateAccount(fromAcc);

        accountDao.updateAccount(toAcc);
    }

    @Transactional
    @Override
    public void deposit(int id, double amount) {
        Account acc=accountDao.getById(id);
        acc.setBalance(acc.getBalance()+amount);
    }

    @Transactional
    @Override
    public void withdraw(int id, double amount) {
        Account acc=accountDao.getById(id);
        acc.setBalance(acc.getBalance()-amount);
    }

    @Override
    public Account getById(int id) {
        return accountDao.getById(id);
    }

    @Transactional
    @Override
    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }

    @Transactional
    @Override
    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }
}
