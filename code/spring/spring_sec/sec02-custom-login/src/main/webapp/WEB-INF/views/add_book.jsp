<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add/Update Book</title>
<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>
</head>
<body>
<form:form action="addbook" method="post" modelAttribute="book">
<form:hidden path="id"/>
	Enter book isbn:<form:input path="isbn"/><form:errors path="isbn"/><br/>
	Enter book title:<form:input path="title"/><form:errors path="title" /><br/>
	Enter book author:<form:input path="author"/><form:errors path="author"/><br/>
	Enter book publisher:<form:select path="publisher" items="${publishers }"/><form:errors path="publisher"/><br/>
	Enter pub date:<form:input path="pubDate"/><form:errors path="pubDate" /><br/>
	Enter book price:<form:input path="price"/><br/>
	<input type ="submit"/>
</form:form>
</body>
</html>





