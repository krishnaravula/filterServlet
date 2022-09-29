package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "/Login", urlPatterns = {
        "/login",
        "/filterServlet/login"})
public class Login extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.print("login servlet loaded");
		String uname=request.getParameter("uname");
		String pass = request.getParameter("password");
		
//		if(uname.equals("sai")|| pass.equals("krishna")) {
//			response.sendRedirect("welcome.jsp");
//		}
//		
		response.sendRedirect("welcome.jsp");
	}



}
