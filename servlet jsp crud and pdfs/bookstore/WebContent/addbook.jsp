<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add new book</title>
</head>
<body>
<form action="BookController.do" method="post">
	<input type="hidden" name="id"  value="0"/>
	<table>
		<tr>
			<td>isbn</td>
			<td><input type="text" name="isbn" id="isbnId"/></td>
		</tr>
		<tr>
			<td>Title</td>
			<td><input type="text" name="title" id="titleId"/></td>
		</tr>
		<tr>
			<td>Author</td>
			<td><input type="text" name="author" id="authorId"/></td>
		</tr>
		<tr>
			<td>pub date</td>
			<td><input type="text" name="pubDate" id="pubDateId"/></td>
		</tr>
		<tr>
			<td>price</td>
			<td><input type="text" name="price" id="priceId"/></td>
		</tr>
		<tr>
			
			<td> <input type="submit"/> </td>
		</tr>
	</table>
</form>
</body>
</html>