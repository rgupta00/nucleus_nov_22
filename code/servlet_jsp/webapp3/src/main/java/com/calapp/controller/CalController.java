package com.calapp.controller;

import com.calapp.model.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Controller :take the req , sentize the data..
        resp.setContentType("text/html");
        Integer a=Integer.parseInt(req.getParameter("x"));
        Integer b=Integer.parseInt(req.getParameter("y"));

        //take the help of model layer
        Integer sum= Calculator.sum(a, b);

        //then pass on that data to be render from jsp
        req.setAttribute("sum",sum);//scope :req, session , appliation *(page scope)
        RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
        rd.forward(req,resp);

    }
}









