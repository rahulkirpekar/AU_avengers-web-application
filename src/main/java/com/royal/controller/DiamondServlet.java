package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DiamondServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String colors[] = 
			{
					"Olive",
					"AntiqueWhite",
					"Aqua",
					"Aquamarine",
					"PaleGoldenRod",
					"Beige",
					"Bisque",
					"Black",
					"BlanchedAlmond",
					"Blue",
					"BlueViolet",
					"Brown",
					"BurlyWood",
					"CadetBlue",
					"Chartreuse",
					"Chocolate",
					"Coral",
					"CornflowerBlue",
					"Cornsilk",
					"Crimson",
					"Cyan",
					"DarkBlue",
					"DarkCyan",
					"DarkGoldenRod",
					"DarkGray",
					"DarkGrey",
					"DarkGreen",
					"DarkKhaki",
					"DarkMagenta",
					"DarkOliveGreen",
					"DarkOrange",
					"DarkOrchid",
					"DarkRed",
					"DarkSalmon",
					"DarkSeaGreen",
					"DarkSlateBlue",
					"DarkSlateGray",
					"DarkSlateGrey",
					"DarkTurquoise",
					"DarkViolet",
					"DeepPink",
					"DeepSkyBlue",
					"DimGray",
					"LightSeaGreen",
					"LightSkyBlue",
					"LightSlateGray",
					"LightSlateGrey",
					"LightSteelBlue",
					"LightYellow",
					"Lime",
					"LimeGreen",
					"Linen",
					"Magenta",
					"Maroon",
					"MediumAquaMarine",
					"MediumBlue"
			};
		
		response.setContentType("text/html");
		
		// &nbsp--HTML
		int l=0;
		PrintWriter out = response.getWriter();
		for (int i = 1; i <=5; i++) 
		{
			for (int k = (5-i); k >=1; k--) 
			{
				out.print("&nbsp ");
			}
			for (int j = 1; j <=i; j++) 
			{
				out.print("<font color='"+colors[l++]+"'>* &nbsp</font>");
			}
			out.println("<br>");
		}
		for (int i = 4; i >=0; i--) 
		{
			for (int k = (5-i); k >=1; k--) 
			{
				out.print("&nbsp ");
			}
			for (int j = 1; j <=i; j++) 
			{
				out.print("<font color='"+colors[l++]+"'>* &nbsp</font>");
			}
			out.println("<br>");
		}
	}
}