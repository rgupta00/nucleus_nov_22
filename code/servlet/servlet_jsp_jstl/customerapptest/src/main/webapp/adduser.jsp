<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>add new user</title>
</head>
<body>
<form action="users.do" method="POST">
    <input type="hidden" name="id"  value="0"/>
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
            <td> Address: </td>
            <td>
                <select name="profile">
                    <option value="admin">Admin</option>
                    <option value="mgr">Mgr</option>
                    <option value="emp">Employee</option>
                </select>

            </td>
        </tr>

        <tr>
            <td>  <input type="submit" value="Add user" /></td>
        </tr>
    </table>
</form>

</body>
</html>