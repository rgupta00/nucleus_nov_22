<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer app</title>
</head>
<body>
<form action="customer.do" method="POST">
    <input type="hidden" name="id"  value="${customer.id}"/>
    <table>
        <tr>
            <td>Name: </td>
            <td> <input name="name" value="${customer.name}" /></td>
        </tr>
        <tr>
            <td>Mobile: </td>
            <td> <input name="mobile" size="9" value="${customer.mobile}"  /></td>
        </tr>
        <tr>
            <td> Address: </td>
            <td>  <input name="addr" value="${customer.address}" ></td>
        </tr>
        <tr>
            <td> E-mail: </td>
            <td> <input name="email"  value="${customer.email}" /></td>
        </tr>
        <tr>
            <td>  <input type="submit" value="Add" /></td>
        </tr>
    </table>
</form>

</body>
</html>