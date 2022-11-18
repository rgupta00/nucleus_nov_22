package com.bankapp.dao;

import com.bankapp.dao.exceptions.DaoException;
import com.bankapp.dao.exceptions.HibernateExcception;

import java.sql.SQLException;

public class AccountHibernateImpl implements AccountDao{
    @Override
    public void addAccount(Account account) throws DaoException {
        System.out.println("data is added using hib");
        try{
            if(1==2)
                throw  new HibernateExcception();
        }catch (HibernateExcception e){
            throw new DaoException(e);
        }
    }
}
