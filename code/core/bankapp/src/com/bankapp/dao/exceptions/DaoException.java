package com.bankapp.dao.exceptions;
//Ex wrapper
public class DaoException extends Exception{
    public DaoException(Exception e){
        super(e);
    }
}
