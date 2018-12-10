<%--
  Created by IntelliJ IDEA.
  User: macuser
  Date: 12/10/18
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>login</title>
    <%@ include file="partials/head.html"%>
</head>
<body>
<%@ include file="partials/navbar.html" %>
<h1>Login Form</h1>

<form action="login.jsp" method="post">
    Username:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
</form>



</body>
</html>
