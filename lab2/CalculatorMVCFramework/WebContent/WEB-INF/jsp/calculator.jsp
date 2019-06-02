<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<style type="text/css">@import url(resources/css/app.css);</style>
		<meta charset="UTF-8">
		<title>Calculator MVC2</title>
	</head>
	<body>
		<div>
			<h2>Enter Values to Compute</h2>
		</div>
		<div class="calculator-form">
			<form action="result" method="post">
				<div>
					<p>Addition:</p>
				</div>
				<div class="add">
					<input name="addOperand1" type="text" size = "6" /> +
					<input name="addOperand2" type="text" size = "6" /> =
					<input name="sumOfTwoOperands" type="text"  size = "6" />
				</div>
				<div>
					<p>Multiplication:</p>
				</div>
				<div class="multiply">
					<input name="multOperand1" type="text" size = "6" /> *
					<input name="multOperand2" type="text" size = "6" /> =
					<input name="productOfTwoOpeands" type="text" size = "6" />
				</div>
				<div>
					<input type="submit" value="Calculate" />
				</div>
			</form>
		</div>
		<div id="error">
			<c:if test="${errors != null}">
				<p> Error! </p>
        		<ul>
		        	<c:forEach var="error" items="${errors}">
		            	<li>${error}</li>
		       		</c:forEach>
	    		</ul>
 			</c:if>
		</div>
	</body>
</html>