package com.bankapp.dao;
import com.bankapp.dao.exceptions.DaoException;
import com.bankapp.dao.exceptions.HibernateExcception;

//raj
public interface AccountDao {
    public void addAccount(Account account)throws DaoException;
}
