package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class EleventhServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
//		StudentBean s1 = (StudentBean)request.getAttribute("student1");
//		StudentBean s2 = (StudentBean)request.getAttribute("student2");
//		StudentBean s3 = (StudentBean)request.getAttribute("student3");

		
		
		HttpSession session =	request.getSession(false);
		StudentBean s1 = (StudentBean)session.getAttribute("student1");
		StudentBean s2 = (StudentBean)session.getAttribute("student2");
		StudentBean s3 = (StudentBean)session.getAttribute("student3");
		
		
		
		
//		Object obj = request.getAttribute("student");
//		StudentBean s = (StudentBean)obj;
		
		System.out.println("EleventhServlet : ");
		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
		System.out.println(s2.getRno()+" " + s2.getName()+" " + s2.getStd()+" " + s2.getMarks());
		System.out.println(s3.getRno()+" " + s3.getName()+" " + s3.getStd()+" " + s3.getMarks());
		
		
		session.removeAttribute("student2");
		
//		RequestDispatcher rd = request.getRequestDispatcher("TwelveServlet");
//		rd.forward(request, response);
	}
}








