package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImplUsingJdbc;
import com.bankapp.dao.AccountDaoImplUsingMap;

import java.util.List;
//as cant work with dao: ie it a mendatory service: gpp: ctr injection vs setter vs field injection*
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;

    private SmsService smsservice;


    public void setSmsservice(SmsService smsservice) {
        this.smsservice = smsservice;
    }

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    //
//    public void setAccountDao(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

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
        Account fromAcc=accountDao.getById(fromAccId);
        Account toAcc=accountDao.getById(toAccId);

        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);

        accountDao.updateAccount(fromAcc);
        accountDao.updateAccount(toAcc);

        if(smsservice!=null) {
            smsservice.sendSms("4656566565");
            System.out.println("sms is send");
        }
        System.out.println("fund is transfred from acc to another");
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
