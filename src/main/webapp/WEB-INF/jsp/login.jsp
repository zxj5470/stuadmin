<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="top.cuggis.javaservlet.stuadmin.*" %>
<%@ page import="top.cuggis.javaservlet.stuadmin.controller.Handler" %>
<html>
<h1>登陆后的界面</h1>
<%
    String s=Handler.handle(request);
    out.print(s);
%>
</html>