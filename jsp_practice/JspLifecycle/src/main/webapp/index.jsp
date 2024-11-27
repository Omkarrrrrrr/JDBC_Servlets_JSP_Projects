<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>This is JSP Demo</h3>

<!--  dynamic web content -->
<%
String name = "Omkar";
int length = name.length();
%>


<!-- Expression tag -->
<%= length %>
</body>
</html>


<!--  html never prints dynamic web content -->