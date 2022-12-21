<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="com.cutomerapp.dao.Customer"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>
<body>
<%
        Customer customer1=(Customer) request.getAttribute("customer");
        out.print(customer1.getId()+"<br>");
        out.print(customer1.getName()+"<br>");
        out.print(customer1.getAddress()+"<br>");
        out.print(customer1.getEmail()+"<br>");
        out.print(customer1.getMobile()+"<br>");

%>
</body>
</html>