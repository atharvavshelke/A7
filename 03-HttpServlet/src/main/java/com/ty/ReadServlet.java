package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String pwd = req.getParameter("password");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(pwd);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>"+name+", Welcome to Http Servlet</h1>"
				+ "</body>"
				+ "</html>");
		
	}
}
