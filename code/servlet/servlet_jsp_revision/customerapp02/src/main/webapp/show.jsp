<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.customerapp.dao.customer.Customer"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>
<body>
Welcome ! ${sessionScope.user.username}<br>
<a href="logout.do">logout</a><br>
<br>
<%
    response.setHeader("Cache-control","no-store");
    response.setHeader("Pragma","no-cache");
    response.setDateHeader("Expires", -1);
%>
<c:if test="${user.profile=='admin' ||user.profile=='mgr'  }">
<a href="customers.do?action=addcustomer">add customer</a>
</c:if>
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
        <c:if test="${user.profile=='admin' ||user.profile=='mgr'  }">
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
            <td><a href="customers.do?action=deleteCustomer&id=<c:out value="${customer.id }"/>">delete</a></td>
            </c:if>
            <c:if test="${user.profile=='admin' ||user.profile=='mgr'  }">
            <td><a href="customers.do?action=updateCustomer&id=<c:out value="${customer.id }"/>">update</a></td>
            </c:if>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>