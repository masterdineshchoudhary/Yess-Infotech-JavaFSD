<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name = request.getParameter("uname");
	out.println("\nWelcome to the jsp world " + name);
	session.setAttribute("user", name);
%>
<a href="session2.jsp">Click Here</a>
</body>
</html>