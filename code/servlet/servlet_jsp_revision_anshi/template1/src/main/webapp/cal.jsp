<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>calculator app</title>
</head>
<body>
<form action="calcontroller" method="post">
    <table>
        <tr>
            <td>x: </td>
            <td> <input name="x" /></td>
        </tr>
        <tr>
            <td>y: </td>
            <td> <input name="y" /></td>
        </tr>
        <tr>
            <td>  <input type="submit" value="Add Nos" /></td>
        </tr>
    </table>
</form>
</body>
</html>