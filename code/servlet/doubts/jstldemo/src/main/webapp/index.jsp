<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>

<body>
<c:forEach var = "i" begin = "1" end = "5">
     <c:out value = "${i}"/><p>
</c:forEach>
</body>
</html>
