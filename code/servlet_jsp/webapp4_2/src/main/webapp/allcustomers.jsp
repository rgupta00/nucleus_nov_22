<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="com.cutomerapp.dao.Customer"%>
<%@page import="java.util.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>display all customers </title>
</head>
<body>
<%
        List<Customer> customers=(List<Customer>) request.getAttribute("custList");
        for(Customer customer1: customers){
            out.print(customer1.getId()+"<br>");
            out.print(customer1.getName()+"<br>");
            out.print(customer1.getAddress()+"<br>");
            out.print(customer1.getEmail()+"<br>");
            out.print(customer1.getMobile()+"<br>");
        }


%>
</body>
</html>