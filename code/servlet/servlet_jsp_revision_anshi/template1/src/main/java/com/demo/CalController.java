package com.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Integer x=Integer.parseInt(req.getParameter("x"));
        Integer y=Integer.parseInt(req.getParameter("y"));

        Integer sum=Calculator.sum(x, y);
        req.setAttribute("sum", sum);
        RequestDispatcher rd=req.getRequestDispatcher("show.jsp");
        rd.forward(req, resp);
        //the servlet should pass this data to a jsp that should display the data

    }


}
