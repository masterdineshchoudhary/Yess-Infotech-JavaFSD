<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="crud.UserDao" %>
	<jsp:useBean id="u" class="crud.UserBean"></jsp:useBean>
	<jsp:setProperty property="*" name="u"/>
	
	<%
	int i = UserDao.save(u);
	if(i>0) {
		response.sendRedirect("success.jsp");
	} else {
		response.sendRedirect("error.jsp");
	}
	%>
</body>
</html>