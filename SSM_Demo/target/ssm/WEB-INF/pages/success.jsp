<%--
  Created by IntelliJ IDEA.
  User: 河流
  Date: 2020/7/2
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>测试页面</title>
</head>
<body>
    <h3>测试成功,结果如下</h3>
    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.moeny}
    </c:forEach>

</body>
</html>
