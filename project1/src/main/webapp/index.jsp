<%--
  Created by IntelliJ IDEA.
  User: Aser
  Date: 27.01.2023
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<h1>Home page</h1>
<p>
    ${message}<br>
    <a href="${pageContext.request.contextPath}/news/add">Add new news</a><br>
    <a href="${pageContext.request.contextPath}/news/list">News list</a><br>
</p>

</body>
</html>
