<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Process</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if ("sa".equals(username) && "123".equals(password)) {
        response.sendRedirect("UserProfile.html");
    } else {
        response.sendRedirect("Login.html");
    }
%>
</body>
</html>
