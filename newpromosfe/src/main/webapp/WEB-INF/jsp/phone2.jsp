<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
	<img src="..\Images\iphone6.jpg" style="width: 35%" height="400px">

	<table align="center">
		<tr>
			<td align="left">NAME</td>
			<td>${phones.product_name}</td>

		</tr>

		<tr>
			<td align="left">MODEL</td>
			<td>${phones.product_model}</td>
		</tr>

		<tr>
			<td align="left">DESCRIPTION</td>
			<td>${phones.product_description}</td>
		</tr>


		<tr>
			<td align="left">PRICE</td>
			<td>${phones.product_price}</td>
		</tr>

	</table>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	<footer class="container-fluid text-center">
	<p align="center">&copy CapStore Copyright 2018</p>

	</footer>
</body>
</html>