<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Customer</title>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
	<form:hidden path="cid"/>
	Enter Name : <form:input path="name"/> <br>
	Enter Mobile : <form:input path="mobile"/> <br>
	Enter Email : <form:input path="email"/> <br>
	Enter Address Line: <form:input path="address.addressLine"/> <br>
	Enter Address : <form:input path="address.city"/> <br>
	Enter Address : <form:input path="address.country"/> <br>
	Enter Address : <form:input path="address.pinNumber"/> <br>
	<input type="submit">
</form:form>
</body>
</html>