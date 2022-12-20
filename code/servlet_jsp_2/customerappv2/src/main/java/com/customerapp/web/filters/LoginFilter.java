package com.customerapp.web.filters;

import com.customerapp.dao.user.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        boolean isLoggedIn=false;
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse res= (HttpServletResponse) response;
        //if user is loggined in he must have hace user in the session scope

        HttpSession httpSession=req.getSession(false);
        if (httpSession!=null){
            User user=(User) httpSession.getAttribute("user");
            System.out.println("---------------");
            System.out.println(user);
            System.out.println("---------------");
            if(user!=null){
                isLoggedIn=true;
            }
        }
        if(isLoggedIn)
            chain.doFilter(request,response);
        else
            res.sendRedirect("login.jsp?error=pls login");
    }

    @Override
    public void destroy() {

    }
}
