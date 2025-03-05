package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp1 {
	public static void main(String[] args) {
		try {
			//1. Load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Create Connection Object, connection is interface
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@39");
			
			//3. Create Statement object
			Statement stmt= con.createStatement();
			
			// SQL query
			
			//TABLE CREATION
			//String sql="create table movies(id int, m_name varchar(50),m_price int )";
			
			
			//INSERTION
			//String sql= "insert into movies values(101,'King',1230)";
			
			//THIS WILL HAPPEN WHEN WE HAVE STUDENT TABLE ALREADY IN MYSQL
			Student std= new Student(306, "Alice","alice123@gmail.com");
			String sql= "insert into student values("+std.getId()+", '"+std.getName()+",'"+std.getEmail()+")";
			
			//4. Execute Query
			stmt.execute(sql);
			System.out.println("Done.");
			
			
			
			
			//5. close the connection object
			con.close();
			//System.out.println("Done.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
