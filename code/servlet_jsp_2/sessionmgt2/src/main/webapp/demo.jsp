<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>
<body>
<%

        String data=(String) session.getAttribute("name");
        out.print(data);
%>
</body>
</html>