package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TableServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException 
	{
		System.out.println("--------------------------------------------------<br>");
		System.out.println("TableServlet object init() : " + this+"<br>");
		System.out.println("--------------------------------------------------<br>");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
		System.out.println("--------------------------------------------------<br>");
		System.out.println("TableServlet object service() : " + this+"<br>");
		System.out.println("--------------------------------------------------<br>");
		System.out.println("HttpServletRequest request : " + request+"<br>");
		System.out.println("HttpServletResponse response : " + response+"<br>");
		System.out.println("--------------------------------------------------<br>");
		
//		int no = 5;
//		for (int i = 1; i <=10; i++) 
//		{
//			System.out.println(5+" * " + i +" = " + (no*i)+"<br>");
//		}
	}
	
	@Override
	public void destroy() 
	{
		System.out.print("--------------------------------------------------<br>");
		System.out.print("TableServlet object service() : " + this+"<br>");
		System.out.print("--------------------------------------------------<br>");
	}
}
