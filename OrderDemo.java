package com.test;

import java.util.Scanner;

//ENCAPSULATION
//POJO : Plain Old Java Object
class Order{
	private int id;
	private String name;
	private int price;
	private int qty;
	public void setId(int id) {
		this.id=id;
	}
public int getId() {
	return id;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public void setqnty(int qty) {
	this.qty=qty;
}
public int getqnty() {
	return qty;
}
}

public class OrderDemo {
	public static void main(String[] args) {
		Order obj= new Order();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		obj.setId(id);
		
		System.out.println("Enter name");
		String name=sc.next();
		obj.setName(name);
		
		System.out.println("Enter Price");
		int price=sc.nextInt();
		obj.setPrice(price);
		
		System.out.println("Enter Quantity");
		int qnty=sc.nextInt();
		obj.setqnty(qnty);
		
		System.out.println("ID:"+ obj.getId()+ " Name:"+obj.getName()
		+" price: "+ obj.getPrice()+" Quantity: "+obj.getqnty());
		
		
		
	}

}
