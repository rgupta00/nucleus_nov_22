package com.bookstore.model.dao.book;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		BookDao dao=new BookDaoImpl();
		List<Book> books=dao.getAllBooks();
		books.forEach(b-> System.out.println(b));
		
		//getBook by id
		//Book book=dao.getBookById(2);
		//System.out.println(book);
		
		//insert the book
//		Book book=new Book("MQ12", "spring in action", "bar", new Date(), 590);
//		Book addedBook=dao.addBook(book);
//		System.out.println(addedBook);
//		
		// update the price
		//dao.updateBook(3, 700);
		//System.out.println("------");
		
		//Book delBook=dao.delBook(3);
		//System.out.println(delBook);
		//System.out.println("--------------");
		
	}

}
