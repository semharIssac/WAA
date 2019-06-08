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
			<h2>Starbuck's ${roast} Roast Coffees:</h2>
		</div>
		<form action="advice" method="get">
			<table>
				<c:forEach var="coffeeRoast" items="${roastList}" varStatus="coffeeStatus">
					<c:choose>
						<c:when test="${(coffeeStatus.index)%2 eq 0}">
							<tr style="background-color:cyan"> 
								<td>${coffeeRoast}</td>
							</tr>
						</c:when>
						<c:otherwise>
							<tr style="background-color:yellow">
								<td>${coffeeRoast}</td>
							</tr>
						</c:otherwise>
					</c:choose> 
				</c:forEach>
			</table>	
			<div>
				<input type="submit" value="Back">
			</div>
		</form>
	</body>
</html>