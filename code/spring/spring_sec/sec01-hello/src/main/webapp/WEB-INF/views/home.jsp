<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:url var="logout" value="/logout"></c:url>
<form:form action="${logout }" method ="post">
	<input type="submit" value="logout">
</form:form>

User: <sec:authentication property="principal.username"/>
User profile: <sec:authentication property="principal.authorities"/>


<sec:authorize access="hasAnyRole('MGR','ADMIN')">
<a href="mgr">MGR</a><br/>
</sec:authorize>

<sec:authorize access="hasRole('ADMIN')">
<a href="admin">admin</a><br/>
</sec:authorize>



<a href="getallbooks">all books</a><br/>
</body>
</html>








