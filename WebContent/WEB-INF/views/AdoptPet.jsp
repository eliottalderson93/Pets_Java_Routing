<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Adopt Your Pet Here</title>
</head>
<body>
	<div class = "wrapper">
	<div class = side>
	<p>Adopt A Dog</p>
	<form method = "post" action = "/Pets/Dog">
	<label for='1'>Name</label>
	<input type = 'text' name = 'dogName' id = '1'>
	<label for='2'>Breed</label>
	<input type = 'text' name = "dogBreed" id = '2'>
	<label for='3'>Weight(lb)</label>
	<input type = 'text' name = "dogWeight" id = '3'>
	<button>Adopt Dog</button>
	</form>
	</div>
	<div class = "side">
	<p>Adopt A Cat</p>
	<form method = "post" action = "/Pets/Cat">
	<label for='1'>Name</label>
	<input type = 'text' name = 'catName' id = '1'>
	<label for='2'>Breed</label>
	<input type = 'text' name = "catBreed" id = '2'>
	<label for='3'>Weight(lb)</label>
	<input type = 'text' name = "catWeight" id = '3'>
	<button>Adopt Cat</button>
	</form>
	
	</div>
	</div>
</body>
</html>