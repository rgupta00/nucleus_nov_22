package com.empapp.dao.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
  //  static final long serialVersionUID = 87516993124229948L;
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
