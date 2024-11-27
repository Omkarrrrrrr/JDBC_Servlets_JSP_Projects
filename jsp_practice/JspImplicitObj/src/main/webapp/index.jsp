<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String name = "Omkar";
out.println(name);
%>

<%
session.setAttribute("session_name", "JSP_Practice");
%>

<form action="output.jsp" method="post">
<input type = "text" name="name1" placeholder="Enter name"/>
<input type = "Submit" value="Click Me"/>
</form>
</body>
</html>