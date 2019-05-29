package com.yazar.takip.demo.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user="springyazar";
		String pass="springyazar";
		String jdbcurl="jdbc:mysql://localhost:3306/yazar-takip-sistemi?useSSL=false&serverTimezone=UTC";
		String driver="com.mysql.jdbc.Driver";
		try{
			PrintWriter out=response.getWriter();
			out.println("Connection jdbc url "+jdbcurl);
			Class.forName(driver);
			Connection con=DriverManager.getConnection(jdbcurl,user,pass);
			out.println("basarili");
            con.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			throw new ServletException();
		}
	
	}

}
