package com.customerapp.web.filter;

import com.customerapp.dao.user.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SecFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        boolean isLoggedIn=false;
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse resp= (HttpServletResponse) response;

        HttpSession httpSession=req.getSession(false);
        if (httpSession!=null){
            User user=(User)httpSession.getAttribute("user");
            if (user!=null){
                isLoggedIn=true;
            }
        }
        if (isLoggedIn==true){
            chain.doFilter(request, response);
        }else{
            resp.sendRedirect("login.jsp?error=pls login");
        }
    }

    @Override
    public void destroy() {

    }
}
