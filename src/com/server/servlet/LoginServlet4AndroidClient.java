package com.server.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.server.resultmodel.LoginModelResult;

/**
 * http://localhost:8080/HelloServlet/LoginServlet4AndroidClient Servlet implementation
 * class LoginServlet4AndroidClient
 */
@WebServlet("/LoginServlet4AndroidClient")
public class LoginServlet4AndroidClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet4AndroidClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1234");
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("4321");

		request.setCharacterEncoding("UTF-8");
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");

		System.out.println("UserName:" + UserName);
		System.out.println("Password:" + Password);

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		/*
		 * …Ë÷√±‡¬Î∏Ò Ω
		 */
		try
		{
			if("18800000000".equals(UserName) && "123456".equals(Password))
			{
				LoginModelResult result = new LoginModelResult();
				
				writer.print(result.getObjectJsonStr());
			}
			else
			{
				writer.print(" ß∞‹");
			}
		}
		catch(Exception e)
		{
			writer.print(" ß∞‹");
		}
		finally
		{
			if(writer != null)
				writer.close();
		}
	}

}
