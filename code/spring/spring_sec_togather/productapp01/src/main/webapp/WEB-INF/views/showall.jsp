<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.productapp.model.dao.entities.Category"%>
<html>
<head>
<meta charset="UTF-8">
<title>customer app</title>
</head>
<body>
<a href="addcategory">add new category</a>
<table border=1>
    <thead>
    <tr>
        <th>Category id</th>
        <th>Category name</th>
        <th>update</th>
        <th>delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td>${category.cid } </td>
            <td>${category.categoryType} </td>
            <td><a href="update?cid=${category.cid }">update</a></td>
            <td><a href="delete?cid=${category.cid}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>