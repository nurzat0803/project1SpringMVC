<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Aser
  Date: 27.01.2023
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add team form</title>
</head>
<body>

<h1>Add team page</h1>
<p>Here you can add new news</p>
<form:form method="POST" commandname="news" action="${pageContext.request.contextPath}/news/add/process">
    <table>
        <tbody>
        <tr>
            <td>Title:</td>
            <td><form:input path="title"></form:input></td>
        </tr>
        <tr>
            <td>News:</td>
            <td><form:input path="news"></form:input></td>
        </tr>
        <tr>
            <td><input value="add" type="submit"></td>
            <td></td>
        </tr>
        </tbody>
    </table>
</form:form>
<p><a href="${pageContext.request.contextPath}/index">Home page</a></p>
</body>
</html>
