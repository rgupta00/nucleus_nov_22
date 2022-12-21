package com.bookstore.model.dao.exceptions;

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(String message) {
		super(message);
	}
}
