package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//INSERT
//UPDATE

public class Exp3 {
public static void main(String[]args) throws Exception{
	
	Class.forName("com.mysql.jdbc.Driver");
	//2. Create Connection Object, connection is interface
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root@39");
	//3. Create Statement object
	//String sql= "insert into Student values(?,?,?)";
	PreparedStatement pst= con.prepareStatement(sql);
	
	//INSERT
	/*
	PreparedStatement pst= con.prepareStatement(sql);
	pst.setInt(1, 101); //1 column 1
	
	pst.setString(2, "King"); //2 is column 2
	pst.setString(3, "king34@gmail.com");
	
	pst.execute();
	System.out.println("Done");
	*/
	
	
	//UPDATE
	
	/*
	String sql= "update Student set  Name=?, email=? where id=?";
	PreparedStatement pst= con.prepareStatement(sql);
pst.setString(1, "Pranjali"); //1 column 1
pst.setString(2, "pranj123@gmai.com"); //2 is column 2
pst.setInt(3, 306);
pst.execute();
System.out.println("Done");
*/
	
	
	
	
	
	
	
	
	/*
	//DELETE
	String sql= "delete from Student where id=?";
	PreparedStatement pst= con.prepareStatement(sql);
	pst.setInt(1
			, 101);
	pst.executeUpdate();
	System.out.println("Done");
	*/
	
	//READ
	
	
	String sql= "select * from Student";
	PreparedStatement pst= con.prepareStatement(sql);
	ResultSet rs= pst.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	
	
	
	
	
	
}
}
