<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

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
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="40" class="d-inline-block align-text-top">
			</a> <a href="index.jsp">home</a>
		</div>
	</nav>


	<h1>Welcome to goa</h1>
	<form action="beach" method="get">

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name</label>
			<input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="enter name">
		</div>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">location</label>
			<input type="text" class="form-control" name="location"
				id="exampleFormControlInput1" placeholder="enter location">
		</div>

		<div class="form-check">
			<input type="radio" class="form-check-input" id="radio2" name="clean"
				value="yes">clean<label class="form-check-label" for="radio2"></label><br>
			<input type="radio" class="form-check-input" id="radio2" name="clean"
				value="no">not clean<label class="form-check-label" for="radio2"></label>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Games</label>
				<input type="text" class="form-control" name="games"
					id="exampleFormControlInput1" placeholder="games">
			</div>

			<div>
				<input type="submit" value="send" class="btn btn-dark">
			</div>
	</form>
</body>
</html>
