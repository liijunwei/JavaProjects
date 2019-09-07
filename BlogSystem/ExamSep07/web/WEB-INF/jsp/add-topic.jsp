<%--
  Created by IntelliJ IDEA.
  User: 532344863
  Date: 2019/9/7
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add topic</title>
</head>
<body>
<div style="margin: 50px auto auto 35%">
<form action="/createTopic" method="post">
    <table cellspacing="20px">
        <tr>
            <td colspan="2" style="text-align: center"><h2>发帖</h2><br></td>
        </tr>
        <tr>
            <td>帖子名称</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td>帖子内容</td>
            <td><textarea name="content"  cols="30" rows="10"></textarea></td>
        </tr>
        <tr>
            <td>发帖人昵称</td>
            <td><input type="text" name="author"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value = "发布"/></td>
        </tr>
    </table>
</form>
<a href="/showTopics">返回话题列表</a>
</div>
</body>
</html>
