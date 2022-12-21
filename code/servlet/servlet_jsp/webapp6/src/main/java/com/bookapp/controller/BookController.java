package com.bookapp.controller;

import com.bookapp.model.BookService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {

        String topic=request.getParameter("topic");

        List<String> books= BookService.getBooks(topic);

        request.setAttribute("books", books);
        RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
        rd.forward(request, response);
    }
}


