<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Starbuck's Spring MVC</title>
	</head>
	<body>
		<div>
			<h2>Login Successful!</h2>
			<h3>Welcome ${userName}!</h3>
		</div>
		<div>
			<form action="advice" method="get">
				<input type = "submit" value = "Get Advice"/>
			</form>
		</div>
	</body>
</html>