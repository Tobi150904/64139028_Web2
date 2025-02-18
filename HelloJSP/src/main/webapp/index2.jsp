<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Declare</title>
</head>
<body>
	<% int x = 10; int y; int z = 0; %>
	<% y = 20; 
    	z = x + y;
    	out.append("Ket qua la:");
    	out.append(String.valueOf(z));
	%>
	<h2>Hoac ta co the xuat kieu Expression</h2>
	<%="Ket qua la:" %>
	<%= z %>
	
</body>
</html>