<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>calculator app</title>
</head>
<body>
<form action="bookController" method="post">
    Select book <p>

    Book:
    <select name="topic" size="1">
        <option value="java">Java</option>
        <option value="servlet">Servlet</option>
        <option value="spring">Spring</option>

    </select>
    <br><br>
    <center>
        <input type="submit">
    </center>
</form>
</body>
</html>