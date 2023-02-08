<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>X-Workz</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid" hight="80px" width="80px">

				 
<a href="BakeryDetails.jsp" value="send"> details </a><br>
	
			</div>
		</nav>
	</div>
	<h1>Save details of bakery</h1>
		<form action="bakery" method="get">

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="enter bakery name">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Owner name
				</label> <input type="text" class="form-control" name="ownerName"
				id="exampleFormControlInput1" placeholder="enter owner name">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Owner wife name
				</label> <input type="text" class="form-control" name="wifeName"
				id="exampleFormControlInput1" placeholder="enter owner wife name">
		</div>
		
				<div class="form-check"><label>Married</label>
			<input type="radio" value="yes" name="married"> yes
			<input type="radio" value="no" name="married"> no
		</div>
		
			<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">bakery famous for
				</label> <input type="textarea" class="form-control" name="famousFor"
				id="exampleFormControlInput1" placeholder="enter famous for">
		</div>

<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">since
				</label> <input type="textarea" class="form-control" name="since"
				id="exampleFormControlInput1" placeholder="since">
		</div>

			<div>
				<input type="submit" value="send" class="btn btn-dark">
			</div>
	</form>
	
</body>
</html>