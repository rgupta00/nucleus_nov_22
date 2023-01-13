<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.productapp.model.dao.entities.Category"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>customer app</title>
<head>
    <script src="<c:url value="/resources/js/global.js"/>"></script>
</head>
<body>
Hi: <sec:authentication property="principal.username"/> !
<sec:authorize access="hasAnyRole('MGR','ADMIN')">
<a href="addcategory">add new category</a>
</sec:authorize>
<table border=1>
    <thead>
    <tr>
        <th>Category id</th>
        <th>Category name</th>
        <sec:authorize access="hasAnyRole('ADMIN')">
        <th>update</th>
        <th>delete</th>
        </sec:authorize>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td>${category.cid } </td>
            <td>${category.categoryType} </td>
            <sec:authorize access="hasAnyRole('ADMIN')">
            <td><a href="update?cid=${category.cid }">update</a></td>
            <td><a href="delete?cid=${category.cid}">delete</a></td>
            </sec:authorize>
        </tr>
    </c:forEach>
    </tbody>
</table>

<!--<a href="logout">logout</a>-->
<c:url var="logout" value="/logout"></c:url>
<form:form action="logout" method ="post">
    <input type="submit" value="logout">
</form:form>
<!---->

</body>
</html>