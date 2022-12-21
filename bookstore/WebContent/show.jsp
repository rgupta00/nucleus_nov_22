<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HCL bookstore application</title>
</head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>


<body>
welcome ${user.username }! <br>
<br>
<a href="LogoutController">logout</a>

<br>
<table>
	<thead>
		<tr>
			<th>id</th>
			<th>isbn</th>
			<th>title</th>
			<th>author</th>
			<th>pub date</th>
			<th>price</th>
			<c:if test="${user.profile=='admin' ||user.profile=='mgr' }">
			<th>update</th>
			</c:if>
			<c:if test="${user.profile=='admin'}">
			<th>delete</th>
			</c:if>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.id}</td>
				<td>${book.isbn}</td>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td><fmt:formatDate  pattern="dd/MM/yyyy" value="${book.pubDate}"/></td>
				<td>${book.price}</td>
				
				<c:if test="${user.profile=='admin' ||user.profile=='mgr' }">
					<td><a href="BookController.do?action=updateBook&id=<c:out value="${book.id}"/>">update</a></td>
				</c:if>
				<c:if test="${user.profile=='admin'}">
					<td><a href="BookController.do?action=delBook&id=<c:out value="${book.id}"/>">delete</a></td>
				</c:if>
				
			</tr>
		</c:forEach>
	</tbody>
</table>
<c:if test="${user.profile=='admin' ||user.profile=='mgr'  }">
	<a href="BookController.do?action=addbook">add new book</a>
</c:if>
<br>
<c:if test="${user.profile=='admin'}">
	<a href="UserMgtController.do">register new user</a>
</c:if>
</body>
</html>