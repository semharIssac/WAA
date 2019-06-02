<%--
  Created by IntelliJ IDEA.
  User: semhar
  Date: 5/28/2019
  Time: 10:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import = "java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! ArrayList<String> listofAdvice = new ArrayList<String>(); %>
<%
    //set things up
    listofAdvice.add("dark");
    listofAdvice.add("medium");
    listofAdvice.add("light");

    request.setAttribute("list", listofAdvice);

%>
  <h2>Advice Page</h2>
<h2>Ask for advise about your favorite roast</h2>
  <form action="/Starbucks_3_war/action/advice" method="get">

     <select name="roast">
         <option value="">--Choose Roast--</option>
         <c:forEach var="i" begin="0" end="2" >
             <option value="${list[i]}" > ${list[i]} </option>
         </c:forEach>
          </select>
      <br/><br/>
     <input type="submit" value="Submit"/><br/><br/>
      </form>
</body>
</html>
