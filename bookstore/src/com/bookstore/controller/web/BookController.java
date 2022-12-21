package com.bookstore.controller.web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.model.dao.book.Book;
import com.bookstore.model.dao.book.BookDao;
import com.bookstore.model.dao.book.BookDaoImpl;
import java.util.*;

@WebServlet("/BookController.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookDao dao = new BookDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action.equals("showallbooks")) {
			request.setAttribute("books", dao.getAllBooks());
			RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
			rd.forward(request, response);
		} 
		else if (action.equals("addbook")) {
			request.getRequestDispatcher("addbook.jsp").forward(request, response);
		}else if(action.equals("delBook")) {
			int id=Integer.parseInt(request.getParameter("id").trim());
			dao.delBook(id);
			response.sendRedirect("BookController.do?action=showallbooks");
		}
		else if(action.equals("updateBook")) {
			int id=Integer.parseInt(request.getParameter("id").trim());
			Book book=dao.getBookById(id);
			request.setAttribute("book", book);
			request.getRequestDispatcher("updatebook.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("id").trim());
		System.out.println("----------------------");
		System.out.println(id);
		System.out.println("----------------------");
		
		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String author = request.getParameter("author");

		String pubDateString = request.getParameter("pubDate");

		String priceStr = request.getParameter("price");
		
		SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");

		Date pubDate = null;
		try {
			pubDate = formate.parse(pubDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Double price=Double.parseDouble(priceStr);
		
		Book book=new Book(isbn, title, author, pubDate, price);
		
		//if id=0 : it is a new book
		//if id!=0 then this book is for updation
		
		if(id==0) {
		dao.addBook(book);
		}else {
			dao.updateBook(id, price);
		}
		
		response.sendRedirect("BookController.do?action=showallbooks");
		
	}

}
