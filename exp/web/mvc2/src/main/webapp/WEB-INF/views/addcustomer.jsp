<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Customer</title>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
	<form:hidden path="id"/>
	Enter Name : <form:input path="name"/> <br>
	Enter Address : <form:input path="address"/> <br>
	Enter Mobile : <form:input path="mobile"/> <br>
	Enter Email : <form:input path="email"/> <br>
	Enter customertype : <form:select path="customertype" items="${customertypes}"/><br/>
	Enter dob : <form:input path="dob"/> <br>
	<input type="submit">
</form:form>
</body>
</html>