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
<form:form action="transfer" method="post" modelAttribute="transferForm">
	From account id : <form:input path="fromAccId"/> <form:errors path="fromAccId" class="error"/> <br>
	To account id : <form:input path="toAccId"/>  <form:errors path="toAccId" class="error"/><br>
	Enter amount : <form:input path="amount"/> <form:errors path="amount" class="error"/><br>
	<input type="submit">
</form:form>
</body>
</html>