<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>update new customer</title>
</head>
<body>
<form action="customers" method="post">
    <table>
        <tr>
            <td>Name: </td>
            <td> <input name="name"  value="${customer.name}"/></td>
        </tr>
        <tr>
            <td>Mobile: </td>
            <td> <input name="mobile" value="${customer.mobile}"/></td>
        </tr>
        <tr>
            <td> Address: </td>
            <td>  <input name="address" value="${customer.address}"></td>
        </tr>
        <tr>
            <td> E-mail: </td>
            <td> <input name="email" value="${customer.email}"/></td>
        </tr>
        <tr>
            <td>  <input type="submit" value="Add Customer" /></td>
        </tr>
    </table>
</form>
</body>
</html>