package com.bookstore.controller.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.model.dao.user.User;
import com.bookstore.model.dao.user.UserDao;
import com.bookstore.model.dao.user.UserDaoImpl;

@WebServlet("/UserMgtController.do")
public class UserMgtController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao=new UserDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("adduser.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String profile=request.getParameter("profile");
		User user=new User(username, password, profile);
		userDao.addUser(user);
		response.sendRedirect("BookController.do?action=showallbooks");
	}
	

}
