<?xml version="1.0" encoding="UTF-8" ?>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
	<body>
		<h1>First Jsp File</h1>	
		<h1>Jsp Fullform is Java Server Page</h1>	
		
		<%
			int no = 5;
			for(int i = 1; i <= 10 ; i++)
			{
				out.print(no+" * " + i +" = " + (no*i)+"<br>");
			}
		%>
		 <br>		
		Addition : <%=2000+1000 %>
		
		<%!
			int getCube(int no)
			{
				return (no*no*no);
			}
		%>
		
		 <br>
		Cube Ans : <%=getCube(no) %>
		
	</body>
</html>
