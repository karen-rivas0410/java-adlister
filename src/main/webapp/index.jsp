<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "Main Page" %></title>
    <%@include file="partials/head.html"%>
</head>

<body>
    <%--<c:if test="true">--%>
        <%--<h1>Variable names should be very descriptive</h1>--%>
    <%--</c:if>--%>
    <%--<c:if test="false">--%>
        <%--<h1>single letter variable names are good</h1>--%>
    <%--</c:if>--%>
    <h1>Welcome to the Site!</h1>
    <form action="/login">
        <button type="submit" class="btn btn-light">Login!</button>
    </form>

</body>
</html>
