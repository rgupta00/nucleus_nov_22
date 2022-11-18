package com.bankapp.controller;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountHibernateImpl;
import com.bankapp.dao.AccountJdbcImpl;
import com.bankapp.dao.exceptions.DaoException;
import com.bankapp.dao.exceptions.HibernateExcception;

public class Main {
    public static void main(String[] args) {
        Account account=new Account(3,"raj");
        AccountDao accountDao=new AccountHibernateImpl();
       try{
           accountDao.addAccount(account);
       }catch (DaoException e){
           System.out.println(e);
       }
    }
}
