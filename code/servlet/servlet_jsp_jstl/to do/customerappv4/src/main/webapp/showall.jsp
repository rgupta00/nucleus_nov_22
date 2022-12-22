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

<a href="logout.do">logout</a><br>
<br>
<table border=1>
    <thead>
    <tr>
        <th>Customer id</th>
        <th>name</th>
        <th>address</th>
        <th>mobile</th>
        <th>email</th>
        <c:if test="${user.profile=='admin'}">
        <th>delete customer</th>
        </c:if>
        <c:if test="${user.profile=='admin' ||user.profile=='mgr' }">
        <th>update customer</th>
        </c:if>
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
            <c:if test="${user.profile=='admin'}">
                <td><a href="customer.do?action=deleteCustomer&id=<c:out value="${customer.id }"/>">delete</a></td>
            </c:if>
            <c:if test="${user.profile=='admin' ||user.profile=='mgr' }">
                <td><a href="customer.do?action=updateCustomer&id=<c:out value="${customer.id }"/>">update</a></td>
            </c:if>
        </tr>
    </c:forEach>
    </tbody>
</table>
<c:if test="${user.profile=='admin' ||user.profile=='mgr' }">
        <a href="customer.do?action=addcustomer">add customer</a><br>
</c:if>
</body>
</html>