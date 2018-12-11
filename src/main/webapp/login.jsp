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
    <%@ include file="partials/head.html"%>
    <%--or you could use jsp include with the param--%>
    <title>login</title>
</head>
<body>
<%@ include file="partials/navbar.html" %>

<h1>Login Form</h1>

<form method="post">
    Username:<input type="text" name="username" required/><br/><br/>
    Password:<input type="password" name="password" required/><br/><br/>
    <input type="submit" value="login"/>
</form>

</body>
</html>
