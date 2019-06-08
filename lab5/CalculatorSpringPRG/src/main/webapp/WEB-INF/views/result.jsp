<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculator MVC2</title>
	</head>
	<body>
		<div>
			<h2>${greeting}</h2>
			<h4>Computed Results</h4>
		</div>
		<div class="result-form">
			<form action="calculator" method="get">
				<div>
					<p>Sum:</p>
				</div>
				<div class="sum">
					<input name="addOperand1" type="text" size = "6" readonly  value="${calculator.addOperand1}" /> +
					<input name="addOperand2" type="text" size = "6" readonly value="${calculator.addOperand2}" /> =
		 			<input name="sumOfTwoOperands" type="text" size = "6" readonly value="${calculator.sumOfTwoOperands}" />
				</div>
		  		
		  		<div>
					<p>Product:</p>
				</div>
		 		<div class="product">
		 			<input name="multOperand1" type="text" size = "6" readonly value="${calculator.multOperand1}" /> *
					<input name="multOperand2" type="text" size = "6" readonly value="${calculator.multOperand2}" /> =
					<input name="productOfTwoOpeands" type="text" size = "6" readonly value="${calculator.productOfTwoOpeands}" />
		 		</div>
				<div>
					<input type="submit" value="Back" />
				</div>
			</form>
		</div>
	</body>
</html>