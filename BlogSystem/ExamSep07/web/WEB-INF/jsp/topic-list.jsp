<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 532344863
  Date: 2019/9/7
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Topic List</title>
</head>
<body>
<div style="margin: 50px auto auto 35%">
<a href="/add-topic" >我要发贴</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/" >返回首页</a><br><br>
<table border="1px" cellspacing="0px" cellpadding="10px">
    <thead>
    <tr>
        <th style="text-align: left">标题</th>
        <th style="text-align: left">发帖人</th>
        <th style="text-align: left">发帖时间</th>
        <th style="text-align: left">浏览量</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${topics}" var="topic">
        <tr>
            <td><a href="/showTopic?topicId=${topic.topicId}">${topic.title}</a></td>
            <td>${topic.author}</td>
            <td>${topic.createDate}</td>
            <td>${topic.clickAmount}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>

</html>
