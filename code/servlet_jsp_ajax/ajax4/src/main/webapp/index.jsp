<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>jQuery, Ajax and Servlet/JSP integration example</title>

    <script src="https://code.jquery.com/jquery-1.10.2.js"
            type="text/javascript"></script>
    <script src="js/app-ajax.js" type="text/javascript"></script>
</head>
<body>

<form>
    Enter Your Name: <input type="text" id="userName"/>
</form>
<br>
<br>

<strong>Ajax Response</strong>:
<div id="ajaxGetUserServletResponse"></div>
</body>
</html>