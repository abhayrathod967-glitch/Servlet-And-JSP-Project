<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Hospital</title>
</head>
<body>

<h1>Hospital Register</h1>

<form action="adminregister">

<label>Name</label>
<input type="text" name="name"><br><br>

<label>Email</label>
<input type="text" name="email"><br><br>

<label>Password</label>
<input type="password" name="password"><br><br>

<input type="submit" value="Register">

<a href="login.jsp">Already Have An Account?</a>

</form>
</body>
</html>