package com.empapp.exeptions;

public class EmpoyeeNotFoundException extends RuntimeException{
    private String message;
    public EmpoyeeNotFoundException(String message) {
        super(message);
    }
}
