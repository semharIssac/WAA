<%--
  Created by IntelliJ IDEA.
  User: semhar
  Date: 5/28/2019
  Time: 10:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "java.util.HashMap" %>
<html>
<head>
    <title>Display Page</title>
</head>
<body>

<table border = '1'>
    <c:forEach var="listofRoast" items = "${displayOutput}">
        <c:if test = "${ignoreIt ne listofRoast }">
            <tr><td>${listofRoast}</td></tr>
        </c:if>

    </c:forEach>
</table>

</body>
</html>
