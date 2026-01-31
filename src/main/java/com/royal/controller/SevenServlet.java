package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SevenServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletConfig config = getServletConfig();
		
		String lang1= config.getInitParameter("lang1");
		String lang2= config.getInitParameter("lang2");
		String lang3= config.getInitParameter("lang3");
		
		PrintWriter out = response.getWriter();
		out.print("<b>SevenServlet : </b>");
		out.print("<b>lang1 : </b>" + lang1+"<br>");
		out.print("<b>lang2 : </b>" + lang2+"<br>");
		out.print("<b>lang3 : </b>" + lang3+"<br>");
		
	}
}
