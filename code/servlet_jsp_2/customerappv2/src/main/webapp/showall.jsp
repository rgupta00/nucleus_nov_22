<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="com.customerapp.dao.customer.Customer"%>
<%@page import="java.util.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>
<body>
<br>
<br>
logoutController

<a href="logoutController.do">logout</a> <br>
<a href="addcustomer.jsp">add new Customer</a> <br>


<br>

<%
     List<Customer> customerList =( List<Customer>)request.getAttribute("customerList");
    for (Customer customer: customerList){
    out.print(customer+"<br>");
    }
%>
</body>
</html>