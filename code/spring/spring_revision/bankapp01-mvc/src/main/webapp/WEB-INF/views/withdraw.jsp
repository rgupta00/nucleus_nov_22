<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fund transfer</title>
	<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>
</head>
<body>
<form:form action="withdraw" method="post" modelAttribute="withdraw">
	From account id : <form:input path="accId"/> <form:errors path="accId" class="error"/> <br>
	To account id : <form:input path="amount"/>  <form:errors path="amount" class="error"/><br>
	<input type="submit">
</form:form>
</body>
</html>