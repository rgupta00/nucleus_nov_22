package com.customerapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out=resp.getWriter();

        HttpSession httpSession=req.getSession();

        Integer counter= (Integer) httpSession.getAttribute("counter");
        if (counter==null){
            out.print("welcome first time user");
            httpSession.setAttribute("counter", 1);
        }else {
          counter++;
          httpSession.setAttribute("counter", counter);
          out.print("you have visited :"+ counter + " time");
        }
    }
}













