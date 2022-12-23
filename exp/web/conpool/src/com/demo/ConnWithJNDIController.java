package com.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


public class ConnWithJNDIController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	DataSource ds =null;
	Connection conn =null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			 ds = (DataSource)envContext.lookup("jdbc/test");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			conn = ds.getConnection();
			System.out.println("conn is done with jndi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
