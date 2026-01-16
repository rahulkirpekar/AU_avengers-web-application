package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EightServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		
		String driverName = context.getInitParameter("driverName");
		String urlName = context.getInitParameter("urlName");
		String userName = context.getInitParameter("userName");
		String password = context.getInitParameter("password");
		
		PrintWriter out = response.getWriter();
		out.print("<b>EightServlet : </b>");
		out.print("<b>driverName : </b>" + driverName+"<br>");
		out.print("<b>urlName : </b>" + urlName+"<br>");
		out.print("<b>userName : </b>" + userName+"<br>");
		out.print("<b>password : </b>" + password+"<br>");
	}
}
