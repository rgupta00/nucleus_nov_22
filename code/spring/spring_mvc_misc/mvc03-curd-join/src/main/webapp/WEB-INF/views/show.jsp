<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.customerapp.dao.Customer"%>
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
        <th>mobile</th>
        <th>email</th>
        <th>address line</th>
        <th>city</th>
        <th>country </th>
        <th>pin number </th>
        <th>update</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customersList}" var="customer">
        <tr>
            <td>${customer.cid } </td>
            <td>${customer.name} </td>
            <td>${customer.mobile}</td>
            <td>${customer.email}</td>
            <td>${customer.address.addressLine}</td>
            <td>${customer.address.city}</td>
            <td>${customer.address.country}</td>
            <td>${customer.address.pinNumber}</td>
            <td><a href="update?id=${customer.cid }">update</a></td>
            <td><a href="delete?id=${customer.cid}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>