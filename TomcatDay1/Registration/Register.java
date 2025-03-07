package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		String uname = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		String url = "jdbc:mysql://localhost:3306/assignment";
		String userName = "root";
		String password = "root@39";
		
		try {
			User obj= new User();
			obj.setFullName(name);
			obj.setUserName(uname);
			obj.setPassword(pass);
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			
			String sql = "insert into user_mla (mla_fname, mla_user, mla_pass)values(?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, obj.getFullName());
			pst.setString(2, obj.getUserName());
			pst.setString(3, obj.getPassword());
			
			int x = pst.executeUpdate();
			
			if(x > 0)
			{
				//RequestDispatcher rd = request.getRequestDispatcher("home.html");
				
				//rd.forward(request, response);
				response.sendRedirect("home.html");
			}
			else
			{
				out.println("<center> <h3><font color = 'red'> Registration failed.</font> </h3></center>");
				
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				
				rd.include(request, response);
			}
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
