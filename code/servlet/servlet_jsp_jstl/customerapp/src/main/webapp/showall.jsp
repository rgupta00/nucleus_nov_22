<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.customerapp.dao.customer.Customer"%>

<%@page import="java.util.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>

<body>
<a href="customer.do?action=addcustomer">add customer</a>
<table border=1>
    <thead>
    <tr>
        <th>Customer id</th>
        <th>name</th>
        <th>address</th>
        <th>mobile</th>
        <th>email</th>
        <th>delete customer</th>
        <th>update customer</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td><c:out value="${customer.id }"/> </td>
            <td><c:out value="${customer.name}"/> </td>
            <td><c:out value="${customer.address}"/> </td>
            <td><c:out value="${customer.mobile}"/> </td>
            <td><c:out value="${customer.email}"/> </td>
            <td><a href="customer.do?action=deleteCustomer&id=<c:out value="${customer.id }"/>">delete</a></td>
            <td><a href="customer.do?action=updateCustomer&id=<c:out value="${customer.id }"/>">update</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>