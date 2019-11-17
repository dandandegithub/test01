<%--
  Created by IntelliJ IDEA.
  User: 蛋蛋
  Date: 2019/11/16
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询成功</h3>

<c:forEach items="${list}" var="account">
    ${account.id}
    ${account.name}
    ${account.money}
</c:forEach>


</body>
</html>
