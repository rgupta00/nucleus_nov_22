package com.customerapp.web.filters;

import com.customerapp.dao.user.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        boolean isLoggedIn=false;
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse res= (HttpServletResponse) response;
        //if user is loggined in he must have hace user in the session scope

        long start=System.nanoTime();
            chain.doFilter(request,response);

            long end=System.nanoTime();


    }

    @Override
    public void destroy() {

    }
}
