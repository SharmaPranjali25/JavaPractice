package com.fls;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerialDemo {
public static void main(String[]args) {
	
	Scanner sc= new Scanner((System.in));
	System.out.println("Enter id: ");
	int id= sc.nextInt();
	
	System.out.println("Enter Name: ");
	String name= sc.next();
	
	System.out.println("Enter City: ");
	String city= sc.next();
	
	System.out.println("Enter PinCode: ");
	int pincode= sc.nextInt();
	
	Customer cstObj= new Customer(id,name,city,pincode);
	//file output stream
	FileOutputStream fout= null;
	BufferedOutputStream bout= null;
	ObjectOutputStream objout= null;
	
	try {
		fout= new FileOutputStream("src/customer.txt");
		bout= new BufferedOutputStream(fout);
		objout= new ObjectOutputStream(bout);
		objout.writeObject(cstObj);
		System.out.println("Done.");
	} 
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			objout.close();
			bout.close();
			fout.close();
		} 
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
}
