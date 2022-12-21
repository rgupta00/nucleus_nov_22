<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookstore login!</title>
</head>
<body>

${param.message }<br>

<form action="LoginController" method="post">
<table>
		<tr>
			<td>username</td>
			<td><input type="text" name="username" id="unId"/></td>
		</tr>
		<tr>
			<td>password</td>
			<td><input type="password" name="password" id="pwId"/></td>
		</tr>
		<tr>
			
			<td><input type="submit"/></td>
		</tr>
</table>

</form>
</body>
</html>