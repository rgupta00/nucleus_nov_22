package com.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class First extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        out.print("hello from servlet First  " + LocalDateTime.now());
        RequestDispatcher rd=request.getRequestDispatcher("second.do");
        rd.forward(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy is called for First servlet");
    }

}
