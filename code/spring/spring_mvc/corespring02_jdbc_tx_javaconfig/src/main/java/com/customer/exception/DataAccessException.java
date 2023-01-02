package com.customer.exception;
//Ex wapper
public class DataAccessException extends RuntimeException{
    public DataAccessException(Throwable cause) {
        super(cause);
    }
}
