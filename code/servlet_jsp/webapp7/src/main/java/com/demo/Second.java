package com.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Second extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.print("hello form servlet second"+"<br>");

        RequestDispatcher rd=req.getRequestDispatcher("third");
        rd.forward(req, resp);
        String data=(String) req.getAttribute("name");
        out.print("data from first servlet :it is second servlet"+data+"<br>");

    }

}
