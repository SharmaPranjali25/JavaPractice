package com.test;
//BATCH PROCESS EXAMPLE
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Exp1 {
	public static void main(String[] args) throws Exception {
		String driverClass="com.mysql.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/assignment";
		String username= "root";
		String password= "root@39";
		
		try {
		Class.forName(driverClass);
		
		Connection con= DriverManager.getConnection(url,username,password);
		
		Statement stmt= con.createStatement();
		
		String sql1= "insert into Student values(10,'Omsri', 'omsri123@gmail.com')";
		String sql2= "insert into Student values(11,'Bhagya', 'bhagya21@gmail.com')";
		String sql3= "insert into Student values(12,'Rohit', 'rohit003@gmail.com')";
		
		
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);
		
		stmt.executeBatch();
		
		//1
		String sql11= "insert into Student values(?,?,?)";
		PreparedStatement pst= con.prepareStatement(sql11);
		pst.setInt(1, 90);
		pst.setString(2, "Rohan");
		pst.setString(3, "rohan23@gmail.com");
		pst.addBatch();
		pst.executeBatch();
		
		//2
		
       
		String sql211= "insert into Student values(?,?,?)";
		PreparedStatement pst2= con.prepareStatement(sql211);
		pst2.setInt(1, 91);
		pst2.setString(2, "Siya");
		pst2.setString(3, "siya89@gmail.com");
		pst2.addBatch();
		pst2.executeBatch();
	
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
