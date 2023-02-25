<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="data:image/jpeg;base64,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"
				alt="" width="80" height="48">
			</a> <a href="index.jsp">Home</a>
		</div>
	</nav>

	<h1>Welcome to Registration</h1>
	
	<c:forEach items="${error}" var="e">
	<h1>
<span style="color:red;">${e.message}</span></h1>
</c:forEach>
	

	<form action="plane" method="post">
<pre>
		Company<input type="text" name="company"> <br>
		Name<input type="text" name="name"> <br>
		Cost<input type="text" name="cost"> <br>
		Type<select type="text" name="type">
			<option value=" ">SELECT</option>
			<c:forEach items="${type}" var="t">
				<option value="${t}">${t}</option>
			</c:forEach>
		</select>
		
		Country <select type="text" name="country"> <br>
			<option value=" ">SELECT</option>
			<c:forEach items="${country}" var="c">
				<option value="${c}">${c}</option>
			</c:forEach>
		</select>
</pre>
<input type="submit" value="save"/>

	</form>
</body>
</html>