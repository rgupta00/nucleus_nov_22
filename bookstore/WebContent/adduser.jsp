<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new user</title>
</head>
<body>
<form action="UserMgtController.do" method="post">
	<table>
		<tr>
			<td>username</td>
			<td><input type="text" name="username" id="unId"/></td>
		</tr>
		<tr>
			<td>password</td>
			<td><input type="text" name="password" id="pwId"/></td>
		</tr>
		<tr>
			<td>profile</td>
			<td>
			<select name="profile" size="1"> 
				<option value="mgr">mgr</option> 
				<option value="emp">emp</option> 
			</select>
		</td>
		</tr>
		
		<tr>
			<td> <input type="submit"/> </td>
		</tr>
	</table>
</form>
</body>
</html>