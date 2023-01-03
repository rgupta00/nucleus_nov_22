package com.bankapp.model.service.exceptions;

public class MyAppAccountNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -4502833288878132096L;

	public MyAppAccountNotFoundException(String message) {
		super(message);
		
	}
}
