package com.bankapp.service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImplUsingJdbc;
import com.bankapp.dao.AccountDaoImplUsingMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
 autowire="constructor">
       <!--constructor-arg index="0" ref="accDao2"/>-->
    </bean>
 */
//as cant work with dao: ie it a mendatory service: gpp: ctr injection vs setter vs field injection*
@Service(value = "accountService")  //<bean id="accountService" class="com.bankapp.service.AccountServiceImpl"
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

    @Override
    public void transfer(int fromAccId, int toAccId, double amount) {
        Account fromAcc=accountDao.getById(fromAccId);
        Account toAcc=accountDao.getById(toAccId);

        fromAcc.setBalance(fromAcc.getBalance()-amount);
        toAcc.setBalance(toAcc.getBalance()+amount);

        accountDao.updateAccount(fromAcc);
        accountDao.updateAccount(toAcc);

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
