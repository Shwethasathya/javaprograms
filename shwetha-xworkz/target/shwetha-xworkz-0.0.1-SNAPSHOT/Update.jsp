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

	<h4>Update the details</h4>
	
	<c:forEach items="${error}" var="e">
	<br>
	
<h1><span style="color:red;">${e.message}</span>
</c:forEach>
	<div><span style="color:green;">${message}</span></div></h1>
	
	<form action="update" method="post">
	
	<div class="mb-3">
     <label for="formFile" class="form-label">Id</label> <input
			type="text" class="form-control" name="id" id="formFile" readonly="readonly" 
			value="${dto.id}" />
		</div>
	
<div class="mb-3">
     <label for="formFile" class="form-label">Name</label> <input
			type="text" class="form-control" name="name" id="formFile"  required="required"
			value="${dto.name}" />
		</div>
Location <select class="form-select" aria-label="Default select example" name="location" required="required"> 
			<option selected value="${dto.location}">${dto.location}</option>
			<c:forEach items="${location}" var="l">
				<option value="${l}">${l}</option>
			</c:forEach>
		</select>
Type <select class="form-select" aria-label="Default select example" name="type" required="required"> 
			<option selected value="${dto.type}">${dto.type}</option>
			<c:forEach items="${type}" var="t">
				<option value="${t}">${t}</option>
			</c:forEach>
		</select>
		<div class="mb-3">
     <label for="formFile" class="form-label">No of cases</label> <input
			type="text" class="form-control" name="noOfCases" id="formFile" required="required"
			 value="${dto.noOfCases}" />
		</div>
<div class="mb-3">
     <label for="formFile" class="form-label">Established Year</label> <input
			type="text" class="form-control" name="establishedYear" id="formFile" required="required"
			 value="${dto.establishedYear}" />
		</div>

		<input type="submit" value="update"/>

	</form>
</body>
</html>