package com.royal.controller;

import java.io.IOException;

import com.royal.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteStudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("DeleteStudentServlet service : id - " + request.getParameter("id"));
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		StudentDao dao =  new  StudentDao();
		
		int rowsAffected = dao.deleteStudentById(id);
		
		if (rowsAffected > 0) 
		{
			request.getRequestDispatcher("ListStudentServlet").forward(request, response);
		} else 
		{
			request.getRequestDispatcher("ListStudentServlet").forward(request, response);
		}
	} 
}
