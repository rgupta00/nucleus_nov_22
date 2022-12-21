<%@page import="com.demo.Employee"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<%
    List<Employee> emps=(List<Employee>) request.getAttribute("emps");
    for(Employee emp: emps){
            out.print(emp.getId()+"<br>");
            out.print(emp.getName()+"<br>");
            out.print(emp.getSalary()+"<br>");
    }
%>
</body>
</html>