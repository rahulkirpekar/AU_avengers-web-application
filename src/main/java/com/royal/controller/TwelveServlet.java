package com.royal.controller;

import java.io.IOException;
import java.util.Enumeration;

import com.royal.bean.StudentBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TwelveServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
/*		Enumeration<String> e = 	request.getAttributeNames();
		System.out.println("TwelveServlet : ");
		while (e.hasMoreElements()) 
		{
			String key = (String) e.nextElement();
			
			Object obj = request.getAt	tribute(key);
			
			if(obj instanceof String) 
			{
				String value = (String)obj;
				System.out.println(key+"----"+value);
			}else if(obj instanceof StudentBean) 
			{
				StudentBean s = (StudentBean)obj;
				System.out.println(key+"----"+s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
			}
			System.out.println(key+"---"+request.getAttribute(key));
			
//			StudentBean value = (StudentBean)request.getAttribute(key);
		}
		
//		StudentBean s2 = (StudentBean)request.getAttribute("student2");
//		StudentBean s3 = (StudentBean)request.getAttribute("student3");

//		Object obj = request.getAttribute("student");
//		StudentBean s = (StudentBean)obj;
		
//		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
//		System.out.println(s3.getRno()+" " + s3.getName()+" " + s3.getStd()+" " + s3.getMarks());
//		System.out.println(s2.getRno()+" " + s2.getName()+" " + s2.getStd()+" " + s2.getMarks());
*/		
		
		HttpSession session = 	request.getSession(false);
		
		StudentBean s1 = (StudentBean)session.getAttribute("student1");
		StudentBean s2 = (StudentBean)session.getAttribute("student2");
		StudentBean s3 = (StudentBean)session.getAttribute("student3");

//		Object obj = request.getAttribute("student");
//		StudentBean s = (StudentBean)obj;
		
		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
		System.out.println(s2.getRno()+" " + s2.getName()+" " + s2.getStd()+" " + s2.getMarks());
		System.out.println(s3.getRno()+" " + s3.getName()+" " + s3.getStd()+" " + s3.getMarks());
		
	}
}
