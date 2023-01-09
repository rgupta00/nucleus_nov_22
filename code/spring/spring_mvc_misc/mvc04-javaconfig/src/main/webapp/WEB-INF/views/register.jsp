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
<form:form action="register" method="post" modelAttribute="user">
	<form:hidden path="id"/>
	Enter username : <form:input path="username"/> <form:errors path="username" class="error"/><br>
	Enter password : <form:input path="password"/> <br>
	Enter phone : <form:input path="communicationDto.phone"/> <br>
	Enter email : <form:input path="communicationDto.email"/> <form:errors path="communicationDto.email" class="error"/><br>
	Enter age : <form:input path="age"/> <br>
	Enter Dob : <form:input path="dob"/><form:errors path="dob" class="error"/> <br>

	Enter country : <form:select path="country" items="${countries}"/><br/>
	choose hobbies <br>
	<form:checkbox path="hobbies" value="Reading"/> :Reading
     <form:checkbox path="hobbies" value="Cricket"/> :	Cricket
	 <form:checkbox path="hobbies" value="Programming"/> :Programming <br>

	choose gender <br>
	<form:radiobutton path="gender" value="male"/> :Male
	<form:radiobutton path="gender" value="female"/> :Female
	<input type="submit">
</form:form>
</body>
</html>