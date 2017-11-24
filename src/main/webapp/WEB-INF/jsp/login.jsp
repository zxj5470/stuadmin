<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="top.cuggis.javaservlet.stuadmin.controller.Handler" %>
<html>
<head>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<h1>登陆后的界面</h1>
<%
    String s = Handler.handle(request);
    out.print(s);
    response.addHeader("currentTimeMillis",System.currentTimeMillis()+"");
%>
<script>
    $.ajax({
        dataType: "text",
        url: '/asyncT',
        data: {},
        success: function (msg) {
            console.log(msg);
            alert(JSON.parse(msg).content);
        }
    })
</script>
</body>

</html>