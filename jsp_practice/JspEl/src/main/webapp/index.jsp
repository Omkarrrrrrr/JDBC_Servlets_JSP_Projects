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
request.setAttribute("request_name","Omkar Java");
out.println(request.getAttribute("request_name"));
%>

<h3>Hello: ${requestScope.request_name}; </h3>

<%
session.setAttribute("session_cname","java_practice");
out.println(session.getAttribute("session_cname"));
%>

<h3> Company name : ${session_cname}</h3>
</body>
</html>