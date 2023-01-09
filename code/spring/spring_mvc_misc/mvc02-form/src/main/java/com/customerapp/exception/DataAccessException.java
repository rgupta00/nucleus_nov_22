package com.customerapp.exception;
//Ex wapper
public class DataAccessException extends RuntimeException{
    public DataAccessException(Throwable cause) {
        super(cause);
    }
}
