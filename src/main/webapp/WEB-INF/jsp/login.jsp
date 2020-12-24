<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户登录</title>
</head>
<body>
    ${msg}
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名:<input type="text" name="username"/><br/>
        密&nbsp;&nbsp;&nbsp;码:
            <input type="password" name="password"/><br/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
