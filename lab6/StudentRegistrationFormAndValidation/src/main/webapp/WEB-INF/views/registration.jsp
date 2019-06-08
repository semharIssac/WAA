<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<style type="text/css">@import url(resources/css/app.css);</style>
		<title>Registration</title>
	</head>
	<body id="registrationForm">
	
		<h1>Student Registration Form</h1>
	
	    <form:form modelAttribute="student" action="registration" method="post" >
	    	<fieldset>
	     	<legend> Add New Student</legend>
	     	<div class="errors">
	     		<form:errors path="*"/>
	     	</div>
	     	<div>
	     		<div>
	     			<label for="firstName">First Name:</label>
	     			<form:input path="firstName"/>
	     		</div>
	     		<div id="firstNameError" >
	     			<form:errors class="errors" path="firstName" />
	     		</div>
	     		
	     	</div>
	     	<div>
	     		<div>
	     			<label for="lastName">Last Name:</label>
	     			<form:input path="lastName"/>
	     			<form:errors class="errors" path="lastName" />
	     		</div>
	     		
	     	</div>
	     	
	     	<div>
	     		<div>
	     			<label for="email">Email:</label>
	     			<form:input path="email"/>
	     			<form:errors class="errors" path="email" />
	     		</div>
	     		
	     	</div>
	     	
	     	<div>
	     		<div>
	     			<label for="birthday">Birthday:</label>
	     			<form:input path="birthday" placeholder="mm/dd/yyyy"/>
	     			<form:errors class="errors" path="birthday" />
	     		</div>
	     		
	     	</div>
	     	
	     	<div>
	     		<div class="phoneFormInput">
	     			<label for="phone">Phone:</label>
	     			<form:input id="area" path="phone.area" />
	     			<form:input id="prefix" path="phone.prefix" />
	     			<form:input id="number" path="phone.number" />
	     		</div>
	     		<div class="errors">
	     			<div id="areaError"><form:errors path="phone.area" /></div>
	     			<div id="prefixError"><form:errors path="phone.prefix" /></div>
	     			<div id="numberError"><form:errors path="phone.number" /></div>
	     		</div>
	     	</div>
	     	<div>
	     		<label for="gender">Gender:</label>
	     		<form:select path="gender" >
	     			<form:option value="-" label="--Select Gender--" />
	     			<form:option value="Male" label="Male" />
	     			<form:option value="Female" label="Female" />
	     		</form:select>
	     	</div>
	     	
	     	<div class="buttons">
	     		<input type="submit" value="Add" />
	     	</div>
	    	</fieldset>           
	    </form:form>
	</body>
</html>