<%--
  Created by IntelliJ IDEA.
  User: 河流
  Date: 2020/7/2
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
当前时间：
<% out.print(new java.util.Date().toLocaleString());%><br>
    <a href="mvc/find">测试查询</a></br>
    <h3>保存测试</h3>
    <form action="mvc/save" method="post">
        姓名：<input type="text" name="name"></br>
        金额：<input type="text" name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
