<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>calculator app</title>
</head>
<body>
<%
    Integer result=(Integer)request.getAttribute("sum");
    out.print("result is "+ result+"<br>");
%>
</body>
</html>