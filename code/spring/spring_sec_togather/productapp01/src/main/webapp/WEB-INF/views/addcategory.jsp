<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add/Update Category</title>
<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>
</head>
<body>
<form:form action="addcategory" method="post" modelAttribute="category">
<form:hidden path="cid"/>
	Enter category Type:<form:input path="categoryType"/><form:errors path="categoryType" /><br/>
	<input type ="submit"/>
</form:form>
</body>
</html>





