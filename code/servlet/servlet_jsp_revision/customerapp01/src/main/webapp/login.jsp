<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>add new customer</title>
</head>
<body>
${param.message}<br>
${param.error}<br>

<form action="login" method="post">
    <table>
        <tr>
            <td>Name: </td>
            <td> <input name="username" /></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td> <input name="password" type="password" /></td>
        </tr>

        <tr>
            <td>
                <select name="profile">
                    <option value="admin">admin</option>
                    <option value="mgr">mgr</option>
                    <option value="emp">emp</option>
                </select>
            </td>
        </tr>

        <tr>
            <td>  <input type="submit" value="Add Customer" /></td>
        </tr>
    </table>
</form>
</body>
</html>