<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Andri
  Date: 31.10.2017
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
users pages
<br>

<c:forEach items="${users}"  var="user">
    ${user.product.PName}<br>
</c:forEach>
</body>
</html>
