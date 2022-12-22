<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>customer update page</title>
</head>
<body>
<form action="customer.do" method="POST">
    <input type="hidden" name="id"  value="${customer.id}"/>
    <table>
        <tr>
            <td>Name: </td>
            <td> <input name="name"  value="${customer.name}" readonly/></td>
        </tr>
        <tr>
            <td>Mobile: </td>
            <td> <input name="mobile" size="9" value="${customer.mobile}" /></td>
        </tr>
        <tr>
            <td> E-mail: </td>
            <td> <input name="email" value="${customer.email}" /></td>
        </tr>

        <tr>
            <td> State: </td>
            <td>  <input name="address" value="${customer.address.state}"></td>
        </tr>

        <tr>
            <td> Country: </td>
            <td>  <input name="address" value="${customer.address.country}"></td>
        </tr>
        <tr>
            <td>  <input type="submit" value="Add" /></td>
        </tr>
    </table>
</form>

</body>
</html>