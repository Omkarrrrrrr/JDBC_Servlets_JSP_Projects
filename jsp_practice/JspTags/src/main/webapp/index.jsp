<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	int a = 10;
	String name = "Om";
	
	int square()
	{
		return a*a;
	}
	%>
	
	<%
	out.println("a: "+ a);
	out.println("name : " + name);
	out.println(square());
	
	int b =20;
	
	if(b<100){
		out.println("b is samller than 100");
	}
	else{
		out.println("b is greater than 100");
	}
	%>
	
	<%= a %>
	<%= name%>
	<%= square() %>
	

</body>
</html>