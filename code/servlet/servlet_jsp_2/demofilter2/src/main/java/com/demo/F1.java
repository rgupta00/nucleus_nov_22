package com.demo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//Chain of responsibility delegates commands to a chain of processing objects*
//ex handing
public class F1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init of filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse resp= (HttpServletResponse) response;

        System.out.println("i am watching you..F1. :) "+req.getRequestURI());
//        System.out.println("i am watching you... :) "+req.getRequestURL());
//        System.out.println("i am watching you... :) "+req.getRemoteAddr());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("destory of F1 is called");
    }
}


