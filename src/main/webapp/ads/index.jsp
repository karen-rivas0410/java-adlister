<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macuser
  Date: 12/11/18
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Ads</h1>
<c:forEach items="${ads}" var="ad">
    <div>
        <h1>${ad.userId}</h1>
        <h2>${ad.title}</h2>
        <h2>${ad.description}</h2>
    </div>
</c:forEach>

</body>
</html>
