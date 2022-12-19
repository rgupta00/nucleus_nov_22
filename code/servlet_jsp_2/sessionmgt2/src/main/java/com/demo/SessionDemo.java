package com.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class SessionDemo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        session.setMaxInactiveInterval(60*2);
        session.setAttribute("name","champ programmer");

       // response.sendRedirect("demo");
        String newURL = response.encodeURL("demo");
        out.println("Click <a href=\"" + newURL + "\">here</a> for another servlet");
        //response.sendRedirect("demo.jsp");


    }
}
