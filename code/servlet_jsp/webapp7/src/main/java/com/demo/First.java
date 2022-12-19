package com.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class First extends HttpServlet {
    //RequestDispacher vs Redirect
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.print("hello form servlet first"+"<br>");

        req.setAttribute("name","raj");
        //out.flush(); // IllegalSateEx

        RequestDispatcher rd=req.getRequestDispatcher("second");
        rd.forward(req, resp);

        out.print("come back to servlet first"+"<br>");

    }

}
