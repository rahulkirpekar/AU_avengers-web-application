package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;
import com.royal.util.StringUtils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out =	response.getWriter();

		StudentBean sbean = new StudentBean();
		
		boolean flag = false;
		
		// BackEnd Validation
		
		String  fullName = request.getParameter("fullName");
		
		if(StringUtils.isValidString(fullName)) 
		{
			sbean.setFullName(fullName);
			
		}else 
		{
			flag = true;
			request.setAttribute("fullNameErr","<font color='red'>Please Enter Valid FullName.</font>");
		}
		
		String  age      = request.getParameter("age");
		
		if(StringUtils.isValidString(age)) 
		{
			sbean.setAge(Integer.parseInt(age));
			
		}else 
		{
			flag = true;
			request.setAttribute("ageErr","<font color='red'>Please Enter Valid Age.</font>");
		}
				
		String  course   = request.getParameter("course");
		
		if(StringUtils.isValidString(course)) 
		{
			sbean.setCourse(course);
			
		}else 
		{
			flag = true;
			request.setAttribute("courseErr","<font color='red'>Please Select Valid Course.</font>");
		}
		
		String  gender   = request.getParameter("gender");
		
		if(StringUtils.isValidString(gender)) 
		{
			sbean.setGender(gender);
			
		}else 
		{
			flag = true;
			request.setAttribute("genderErr","<font color='red'>Please Select Valid Gender.</font>");
		}

		String  hobby[]    = request.getParameterValues("hobby");
		
		if(hobby != null) 
		{
			sbean.setHobbies(hobby);
			
		}else 
		{
			flag = true;
			request.setAttribute("hobbyErr","<font color='red'>Please Select Valid Hobby.</font>");
		}
		
		String  dob      = request.getParameter("dob");
		
		if(StringUtils.isValidString(dob)) 
		{
			sbean.setDob(dob);
			
		}else 
		{
			flag = true;
			request.setAttribute("dobErr","<font color='red'>Please Select Valid DOB.</font>");
		}
		
		String  email    = request.getParameter("email");
		
		if(StringUtils.isValidString(email)) 
		{
			sbean.setEmail(email);
			
		}else 
		{
			flag = true;
			request.setAttribute("emailErr","<font color='red'>Please Select Valid Email.</font>");
		}
		
		String  mobile   = request.getParameter("mobile");
		
		if(StringUtils.isValidString(mobile)) 
		{
			sbean.setMobile(mobile);
			
		}else 
		{
			flag = true;
			request.setAttribute("mobileErr","<font color='red'>Please Select Valid Mobile.</font>");
		}

		String  address  = request.getParameter("address");

		if(StringUtils.isValidString(address)) 
		{
			sbean.setAddress(address);
			
		}else 
		{
			flag = true;
			request.setAttribute("addressErr","<font color='red'>Please Select Valid Address.</font>");
		}
		
		RequestDispatcher rd = null;
		
		if(flag) 
		{
			rd = request.getRequestDispatcher("studentregi.jsp");
		}else 
		{
			StudentDao dao = new StudentDao();
			
			int rowsAffected = dao.insertStudent(sbean);
			
			if(rowsAffected > 0) 
			{
				rd = request.getRequestDispatcher("ListStudentServlet");
				
			}else 
			{
				request.setAttribute("dberror", "<font color='red'>Student record not Inserted due to Database Error.</font>");
				rd = request.getRequestDispatcher("studentregi.jsp");
			}
		}
		rd.forward(request, response);
	}
}



