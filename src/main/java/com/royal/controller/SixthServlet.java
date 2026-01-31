package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SixthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		
		Enumeration<String> e = config.getInitParameterNames();
		
		out.print("<b>SixthServlet : </b><br>");
		
		while(e.hasMoreElements()) 
		{
			String paramName = e.nextElement();
			
			String paramValue = config.getInitParameter(paramName);
			
			out.print("<b>"+paramName+" : </b>" + paramValue+"<br>");
		}
		
		
//		String lang1= config.getInitParameter("lang1");
//		String lang2= config.getInitParameter("lang2");
//		String lang3= config.getInitParameter("lang3");
		
//		PrintWriter out = response.getWriter();
//		out.print("<b>SixthServlet : </b>");

//		
//		String subj1= config.getInitParameter("subj1");
//		String subj2= config.getInitParameter("subj2");
//		String subj3= config.getInitParameter("subj3");
		
//		PrintWriter out = response.getWriter();
//		out.print("<b>SixthServlet : </b>");
//		out.print("<b>subj1 : </b>" + subj1+"<br>");
//		out.print("<b>subj2 : </b>" + subj2+"<br>");
//		out.print("<b>subj3 : </b>" + subj3+"<br>");
		
		
//		Enumeration<String> e = config.getInitParameterNames();
//		
//		while (e.hasMoreElements()) 
//		{
//			String paramName = (String) e.nextElement();
//
//			String paramValue = config.getInitParameter(paramName);
//			
//			out.print("<b>"+paramName+" : </b>" + paramValue+"<br>");
//		}
	}
}
