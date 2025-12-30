package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.dbcon.DBConnection;
@WebServlet("/adminregister")
public class AdminRegister extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		try {
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String pass = req.getParameter("password");


			Connection c = DBConnection.getMyconnection();

			PreparedStatement ps = c.prepareStatement("insert into hospital_details values(?,?,?)");

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pass);

			int result = ps.executeUpdate();

			if(result == 1 ) {
				pw.print("Admin Register Successfully");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, res);
			}else {
				pw.print("Admin Register Not Successfully");
				req.setAttribute("Message", "Admin Not Register Please Correct Details");
				RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
