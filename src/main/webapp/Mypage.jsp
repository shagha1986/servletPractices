<%--
  Created by IntelliJ IDEA.
  User: shaghayegh
  Date: 24.09.18
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Jsp Page</title>
</head>
<body>
<form action="servlet/Hello">
    name: <input type="text" name="user">
    family: <input type="text" name="family">
    <input type="submit" value="click!">
</form>
<br>
<form action="servlet/Login">
    username: <input type="text" name="username">
    Password: <input type="text" name="password">
    <input type="submit" value="login!">
</form>
<br>
<form action="Google">
    type what do you want to serch: <input type="text" name="searchtxt">

    <input type="submit" value="search!">
</form>
<br>


</body>
</html>
