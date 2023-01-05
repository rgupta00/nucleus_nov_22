<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.bankapp.dao.account.Account"%>
<html>
<head>
<meta charset="UTF-8">
<title>customer app</title>
</head>
<body>
<a href="transfer">tansfer </a><br>
<a href="deposit">deposit </a><br>
<a href="withdraw">withdraw </a><br>
<table border=1>
    <thead>
    <tr>
        <th>Customer id</th>
        <th>name</th>
        <th>balance</th>
        <th>update</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${accounts}" var="account">
        <tr>
            <td>${account.id } </td>
            <td>${account.name} </td>
            <td>${account.balance}</td>
            <td><a href="update?id=${account.id }">update</a></td>
            <td><a href="delete?id=${account.id}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>