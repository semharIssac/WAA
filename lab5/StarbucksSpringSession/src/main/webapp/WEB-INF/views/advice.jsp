<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Starbuck's Spring MVC</title>
	</head>
	<body>
		<div>
			<h2>Ask for advice about your favorite roast:</h2>
		</div>
		<form action = "advice" method="post">
			<select name="roast"   >
				<c:forEach var="roast" items="${roasts}">
					<option value="${roast.value}"> ${roast.key} </option>
				</c:forEach>
			</select>
			<div>
				<input type="submit" value = "Ask"/>
			</div>
		</form>
		<form action = "logout" method="get">
			<div>
				<input type="submit" value = "Logout"/>
			</div> 
		</form>
	</body>
</html>