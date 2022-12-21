package com.bookstore.controller.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookstore.model.dao.user.User;

@WebFilter("*.do")
public class SecFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		boolean isValid=false;
		
		HttpSession httpSession=req.getSession(false);//looking for pre existing session
		
		if(httpSession!=null) {
			User user=(User) httpSession.getAttribute("user");
			if(user!=null) {
				isValid=true;
			}
		}
		if(isValid) {
			chain.doFilter(request, response);
		}else {
			res.sendRedirect("login.jsp?message=login please");
		}
	}

	public void destroy() {
		
	}

}
