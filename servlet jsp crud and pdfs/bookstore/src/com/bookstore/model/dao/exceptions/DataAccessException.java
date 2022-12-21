package com.bookstore.model.dao.exceptions;

public class DataAccessException extends RuntimeException {

	public DataAccessException(String message) {
		super(message);
	}
}