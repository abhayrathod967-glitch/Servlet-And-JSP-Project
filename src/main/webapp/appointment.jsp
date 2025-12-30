<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="appointment">

<h1>Welcome to Patient Register</h1>

<label>ID</label>
<input type="text" name="id"><br><br>

<label>Name</label>
<input type="text" name="name"><br><br>

<label>Number</label>
<input type="number" name="number"><br><br>

<option>Select Doctor</option>
<select name="doctor">
       <option>Doctors</option>
      <option value="Dr Akash">Dr Akash</option>
      <option value="Dr Praful">Dr Praful</option>
      <option value="Dr Rathod">Dr Rathod</option>
</select><br><br>
<input type="submit" value="Book Or Appointment"><br><br>

</form>
</body>
</html>