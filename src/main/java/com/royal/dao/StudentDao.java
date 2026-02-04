package com.royal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.royal.bean.StudentBean;
import com.royal.util.DBConnection;

public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(fullName,age,course,gender,hobbies,dob,email,mobile,address) VALUES (?,?,?,?,?,?,?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
				
				pstmt.setString(1, sbean.getFullName());
				pstmt.setInt(2, sbean.getAge());
				pstmt.setString(3, sbean.getCourse());
				pstmt.setString(4, sbean.getGender());
				pstmt.setString(5, sbean.getHobbieStr());
				pstmt.setString(6, sbean.getDob());
				pstmt.setString(7, sbean.getEmail());
				pstmt.setString(8, sbean.getMobile());
				pstmt.setString(9, sbean.getAddress());
				
				System.out.println("pstmt : "  +pstmt);
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--insertStudent Db not connected");
		}
		return rowsAffected;
	}

	public ArrayList<StudentBean> getAllStudentRecords() 
	{
		String selectQuery = "SELECT * FROM student";
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		ResultSet rs = null;
		StudentBean s = null;
		ArrayList<StudentBean> list  = new ArrayList<StudentBean>();
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
			
				rs = pstmt.executeQuery();
				
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String fullName = rs.getString(2);
					int age = rs.getInt(3);
					String course = rs.getString(4);
					String gender = rs.getString(5);
					String hobbiesStr = rs.getString(6);
					String dob = rs.getString(7);
					String email = rs.getString(8);
					String mobile = rs.getString(9);
					String address = rs.getString(10);
					
					String hobbies[] = hobbiesStr.split(",");
					
					s= new StudentBean(id, fullName, age, course, gender, hobbies, dob, email, mobile, address);
					
					list.add(s);
				}
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--insertStudent Db not connected");
		}
		return list;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(new StudentDao().getAllStudentRecords().size());
		
	}
}
