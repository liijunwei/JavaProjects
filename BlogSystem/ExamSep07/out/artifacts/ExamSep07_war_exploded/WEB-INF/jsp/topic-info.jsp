<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 532344863
  Date: 2019/9/7
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Topic Info</title>
</head>
<body>
<div style="margin: 50px auto auto 35%">
<h2>
    ${topicInfo.title}&nbsp;&nbsp;
    ${topicInfo.author}&nbsp;&nbsp;
    ${topicInfo.createDate}&nbsp;&nbsp;
    共被浏览过${topicInfo.clickAmount}次
</h2><br>
<h2>
    ${topicInfo.content}
</h2>
——————————————————————————<br>
以下是评论区
<c:forEach items="${topicInfo.replyList}" var="topic">
    <div>
        昵称：&nbsp;&nbsp;
            ${topic.author}&nbsp;&nbsp;
        时间：&nbsp;&nbsp;
            ${topic.createDate}&nbsp;&nbsp;<br>
            ${topic.content}
    </div>
    <div>=============================================</div>
</c:forEach>
——————————————————————————
<form action="/createReply" method="post">
    <table cellspacing="10px">
        <tr>
            <td colspan="2"><input name="topicId" value="${topicInfo.topicId}" hidden="hidden"></td>
        </tr>
        <tr>
            <td>昵称</td>
            <td><input type="text" name="author" id="1" value="山阴路"><br></td>
        </tr>
        <tr>
            <td>评论</td>
            <td><textarea name="content" id="2" cols="30" rows="10"></textarea></td>
        </tr>
        <tr>
            <td><input type="submit" value="发表评论"></td>
            <td style="text-align: center"><a href="/showTopics">返回话题列表</a></td>
        </tr>
    </table>
</form>
<%--</div>--%>
</body>
</html>
