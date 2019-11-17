<%--
  Created by IntelliJ IDEA.
  User: 蛋蛋
  Date: 2019/11/16
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/testFindAll">findAll</a><br>

    <form action="account/testSave" method="post">
        姓名：<input type="text" name="name"/>
        金额：<input type="number" name="money"/>
        <input type="submit" value="提交"/>
    </form>

</body>
</html>
