package com.test;

public class MethodOlnR {
	//method overloading (Method heading=same)
	// (signature=different)
	public void add(int x, int y) {
		System.out.println("No. of Arguments");
	}
	public void add(long x, float y) {
		System.out.println("Type of Arguments are different");
	}
	public void add(float x, long y) {
		System.out.println("Order of Arguments");
	}
public static void main(String[] args) {
	MethodOlnR obj= new MethodOlnR();
	obj.add(10,30);
	obj.add(33l, 3.33f);
	obj.add(44.55f, 939l);
	
}
}
