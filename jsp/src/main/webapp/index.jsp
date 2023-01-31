<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>Send message</h1>
<form action="sms" method="post">
<pre>
FirstName <input type="text" name="firstName"/><br>
LastName <input type="text" name="lastName"/><br>
Gender <input type="radio" name="gender" value="male"/>male<br>
	  <input type="radio" name="gender" value="female"/>female
	  <input type="radio" name="gender" value="other"/>other
reason<textarea rows="5" cols="10" name="reason"></textarea> 
address<textarea rows="5" cols="10" name="address"></textarea> 
<input type ="submit" value="send"/>
</pre>
</form>
</body>
</html>