<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.customerapp.dao.entity.Customer"%>
<html>
<head>
<meta charset="UTF-8">
<title>customer app</title>
</head>
<body>
<a href="addcustomer">add customer</a>
<table border=1>
    <thead>
    <tr>
        <th>Customer id</th>
        <th>name</th>
        <th>address</th>
        <th>mobile</th>
        <th>email</th>
        <th>update</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customersList}" var="customer">
        <tr>
            <td>${customer.id } </td>
            <td>${customer.name} </td>
            <td>${customer.address}</td>
            <td>${customer.mobile}</td>
            <td>${customer.email}</td>
            <td><a href="update?id=${customer.id }">update</a></td>
            <td><a href="delete?id=${customer.id}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>