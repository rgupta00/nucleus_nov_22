<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>
<body>
${param.error}<br>
${param.message}<br>
<form action="loginController" method="POST">
    <table>
        <tr>
            <td>Name: </td>
            <td> <input name="name" /></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td> <input name="password" type="password"/></td>
        </tr>

        <tr>
            <td>  <input type="submit" value="Login" /></td>
        </tr>
    </table>
</form>

</body>
</html>