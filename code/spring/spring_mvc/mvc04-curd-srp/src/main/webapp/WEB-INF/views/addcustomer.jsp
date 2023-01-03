<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Customer</title>
	<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
	<form:hidden path="id"/>
	Enter Name : <form:input path="name"/> <form:errors path="name" class="error"/> <br>
	Enter Address : <form:input path="address"/>  <form:errors path="address" class="error"/><br>
	Enter Mobile : <form:input path="mobile"/> <form:errors path="mobile" class="error"/><br>
	Enter Email : <form:input path="email"/> <form:errors path="email" class="error"/><br>
	Enter customertype : <form:select path="customertype" items="${customertypes}"/><br/>
	Enter dob : <form:input path="dob"/> <form:errors path="dob" class="error"/><br>
	<input type="submit">
</form:form>
</body>
</html>