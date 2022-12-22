<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>add new customer</title>
</head>
<body>
<form action="customer.do" method="POST">
    <input type="hidden" name="id"  value="0"/>
    <table>
        <tr>
            <td>Name: </td>
            <td> <input name="name" /></td>
        </tr>
        <tr>
            <td>Mobile: </td>
            <td> <input name="mobile" size="9" /></td>
        </tr>
        <tr>
            <td> Address: </td>
            <td>  <input name="address"></td>
        </tr>
        <tr>
            <td> E-mail: </td>
            <td> <input name="email" size="25" /></td>
        </tr>
        <tr>
            <td>  <input type="submit" value="Add" /></td>
        </tr>
    </table>
</form>

</body>
</html>