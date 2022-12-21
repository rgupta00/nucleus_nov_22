<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update existing book</title>
</head>
<body>
<form action="BookController.do" method="post">
	<input type="hidden" name="id"  value="${book.id}"/>
	<table>
		<tr>
			<td>isbn</td>
			<td><input type="text" name="isbn"  value="${book.isbn}" id="isbnId" readonly/></td>
		</tr>
		<tr>
			<td>Title</td>
			<td><input type="text" name="title"  value="${book.title}" id="titleId" readonly/></td>
		</tr>
		<tr>
			<td>Author</td>
			<td><input type="text" name="author"  value="${book.author}"  id="authorId" readonly/></td>
		</tr>
		<tr>
			<td>pub date</td>
			<td><input type="text" name="pubDate"  value="<fmt:formatDate  pattern="dd/MM/yyyy" value="${book.pubDate}"/>"  id="pubDateId" readonly/></td>
		</tr>
		<tr>
			<td>price</td>
			<td><input type="text" name="price"  value="${book.price}"  id="priceId"/></td>
		</tr>
		<tr>
			
			<td> <input type="submit"/> </td>
		</tr>
	</table>
</form>
</body>
</html>