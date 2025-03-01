package com.test;
class Customer{
	public Customer() {
		System.out.println("Constructor");//5
	}
	{
		System.out.println("Instance Block");//4
	}
	static {
		System.out.println("Static Block  Customer");//3
	}
}
public class BlocksDemo {
	public BlocksDemo() {
	System.out.println("Constructor");//
	}
	{
		System.out.println("Instance Block");//
	}
	static {
		System.out.println("Static Block BlocksDemo");//1
	}
	public static void main(String[] args) {
		System.out.println("From main()");//2
		Customer obj= new Customer();
		
	}

}
