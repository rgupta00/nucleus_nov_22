package com.demo;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Hello extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        Employee employee=new Employee(1,"raj",7000.00);
        Employee employee2=new Employee(1,"ekta",7000.00);

        Employee employee3=new Employee(1,"gun",7000.00);

        List<Employee> employees=new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);

        request.setAttribute("emps",employees);

        RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
        rd.forward(request,response);
    }
}
