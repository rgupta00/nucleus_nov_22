<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>book app</title>
</head>
<body>
<%
List<String>list=(List<String>)request.getAttribute("books");
    Iterator it=list.iterator();
    while(it.hasNext()){
    out.print(it.next()+"</br>");
    }
%>
</body>
</html>