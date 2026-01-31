<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="jakarta.servlet.http.HttpSession"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
	
		if(userName == null || password == null)
		{
			response.sendRedirect("login.jsp");	
		}else
		{
			if(userName.equals("admin") && password.equals("123"))
			{
				session.setAttribute("userName",userName);
				out.print("Login Successfully...."+userName);
			}
		}
	%>
	
</body>
</html>
