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
	<form:hidden path="id"/>
	Enter Name : <form:input path="name"/> <br>
	Enter Address : <form:input path="address"/> <br>
	Enter Mobile : <form:input path="mobile"/> <br>
	Enter Email : <form:input path="email"/> <br>
	<form:radiobutton path = "gender" value = "true" label = "Male" />
	<form:radiobutton path = "gender" value = "false" label = "Female" />
	Enter Customer Type: <form:select path="customerType" items="${customerTypes}"/><br/>
	Choose frameworks: <form:checkboxes path="framework" items="${javaFramworks}" delimiter="|"/><br>
	<input type="submit">
</form:form>
</body>
</html>