<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head></head>
<body>

<form action="/login" method="post">
    <input type="text" name="name" placeholder="用户名">
    <input type="password" name="password" placeholder="密码">
    <input type="submit" value="登录">
</form>

</body>
</html>