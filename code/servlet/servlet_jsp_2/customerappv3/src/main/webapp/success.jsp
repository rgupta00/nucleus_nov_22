<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="com.customerapp.dao.customer.Customer"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>
<body>
<%

Customer cust=(Customer)   session.getAttribute("customer");

out.print("Id: "+ cust.getId()+"<br>");
out.print("Name: "+ cust.getName()+"<br>");
out.print("Address: "+ cust.getAddress()+"<br>");
out.print("Email: "+ cust.getEmail()+"<br>");
out.print("Mobile no: "+ cust.getMobile()+"<br>");
%>
</body>
</html>