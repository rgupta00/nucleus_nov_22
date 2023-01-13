<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		<h1>Hello World!</h1>
		<div class="row">
			<div class="col-sm-8">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>id</th>
							<th>isbn</th>
							<th>title</th>
							<th>author</th>
							<th>price</th>
							<th>pubDate</th>
							<th>publisher</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="book" items="${books}">
							<tr>
								<td><c:out value="${book.id }" /></td>
								<td><c:out value="${book.isbn }" /></td>
								<td><c:out value="${book.title }" /></td>
								<td><c:out value="${book.author }" /></td>
								<td><c:out value="${book.price }" /></td>
								<td><fmt:formatDate pattern="dd/MM/yyyy" value="${book.pubDate }" /></td>
								<td><c:out value="${book.publisher }" /></td>
								<td><a href="update?id=<c:out value="${book.id }"/>">update</a>
								<td>
								<td><a href="delete?id=<c:out value="${book.id }"/>">delete</a>
								<td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<a href="addbook">add book</a>

			</div>
		</div>
	</div>

</body>
</html>







