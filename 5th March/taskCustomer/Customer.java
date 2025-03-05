package com.fls;

import java.io.Serializable;

public class Customer implements Serializable{
	private static final long serialVersionID= 1L;
	private int id;
	private String name;
	private String city;
	private int pinCode;
	
	public Customer() {
		
	}
	
public Customer(int id, String name, String city, int pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pinCode = pinCode;
	}
//store customer data to files then Read this data

public int getId() {
		return id;
}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}


	
	
	
	
	
	

public static void main(String[] args) {
	
}
}
