package com.royal.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TenthServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		StudentBean sbean1 = new StudentBean(1, "Rahul", 12, 100);
		StudentBean sbean2 = new StudentBean(2, "Ankur", 10, 90);
		StudentBean sbean3 = new StudentBean(3, "Sagar", 11, 70);
		
//		request.setAttribute("student1", sbean1);
//		request.setAttribute("student2", sbean2);
//		request.setAttribute("student3", sbean3);
		
		// session 
		HttpSession session = request.getSession();
		
		session.setAttribute("student1", sbean1);
		session.setAttribute("student2", sbean2);
		session.setAttribute("student3", sbean3);
		
//		RequestDispatcher rd = request.getRequestDispatcher("EleventhServlet");
//		rd.forward(request, response);
	}
}







