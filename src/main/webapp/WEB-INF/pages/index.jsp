<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 index page
<br>
<sf:form action="/save" method="post" modelAttribute="user">
    <sf:input path="name"/>
    <sf:input path="product"></sf:input>
    <sf:input path="surname"></sf:input>
    <input type="submit" value="save" >
</sf:form>
<a href="/users">go to users page</a>
</body>
</html>
