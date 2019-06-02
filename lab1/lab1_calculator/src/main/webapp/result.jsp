<%--
  Created by IntelliJ IDEA.
  User: semhar
  Date: 5/28/2019
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
<input type = "text" name = "add1" size = "2"  value = "${param["add1"]}" />+
<input type = "text" name = "add2" value = "${param["add2"]}" size = "2"/>=<input type = "text" name = "sum" value = "${sum}"  size = "2" readonly/><br/>
<input type = "text" name = "mult1" value = "${param["mult1"]}" size = "2"/>*
<input type = "text" name = "mult2" value = "${param["mult2"]}"  size = "2"/>=<input type = "text" name = "product" value = "${product}"   size = "2" readonly/><br/>
<input type = "submit" value = "Submit"/>
</body>
</html>
