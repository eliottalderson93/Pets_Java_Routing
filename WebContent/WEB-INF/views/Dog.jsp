<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Your Adopted Dog</title>
</head>
<body>
<div class = "wrapper"><p>The Dog Page</p>
<p><c:out value ="${YourDog.weight}"/></p>
<p><c:out value ="${YourDog.showAffection()}"/></p></div>
<p>test</p>
</body>
</html>