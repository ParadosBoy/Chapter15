<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>系统主页</title>
</head>
<body>
    当前用户:${USER_SESSION.username}
    <a href="${pageContext.request.contextPath }/logout">退出</a>
</body>
</html>
