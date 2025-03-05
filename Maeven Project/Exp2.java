package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Exp2 {
	public static void main(String[]args) {
		try {
			//1. Load the Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Create Connection Object, connection is interface
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@39");
			
			//3. Create Statement object
			Statement stmt= con.createStatement();
			
			// SQL query
			
		//TABLE CREATION
		//String sql="create table Employee(id int, emp_name varchar(50),emp_email varchar(50), emp_city varchar(20) )";
		
		//INSERTION
			
		//String sql= "insert into Employee values(101,'Alice','alice123@gmail.com','Pune'),(102,'Bob','bob453@gmail.com','Chennai'),(103,'Eve','eve45@gmail.com','Goa'),(104,'Funy','funy4@gmail.com','Ranchi')";
			//String sql= "insert into Employee values(105,'Alicey','alicey23@gmail.com','Pune'),(106,'Bobby','bobby3@gmail.com','Porur'),(107,'Evey','evey45@gmail.com','Ghuwati'),(108,'Ravi','ravi009@gmail.com','Mumbai'),(109,'Jasmine','jas23@gmail.com','Odisha'),(110,'Aarti','aarti98@gmail.com','Sarkaghat')";
		
			//UPDATE
		//	String sql= "update employee set emp_name='Bhagya' , emp_email= 'bhagya420@gmail.com' , emp_city='Mangalore' where id=101";
			
			
			//DELETE
			//String sql= "delete from  Employee where id=110";
			
			
			
			
			
		//4. Execute Query
			//READ
			
			

			String sql= "select * from Employee";
			ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("ID: "+ rs.getInt(1)+" Name: "+rs.getString(2)+" Email: "+ rs.getString(3)+" City: "+ rs.getString(4));
				
			}
			ResultSetMetaData rsd= rs.getMetaData();
			System.out.println(rsd.getColumnCount());
			System.out.println(rsd.getColumnType(1));
			
			
			
			
		System.out.println("Done.");
		
		//5. close the connection object
		//con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
