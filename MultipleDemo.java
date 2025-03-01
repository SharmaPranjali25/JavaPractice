package com.test;

interface Inf1{
	void fox(); //abstract method have no bodies
	void tiger();
	
}

interface Inf2{
	void book(); //abstract method have no bodies
	
	
}
abstract class Abs {
	public void dog() {
		System.out.println("Abs Implemented method");
	}
	public abstract void cat(); //no body as abstract method
}
class Impl extends Abs implements Inf1,Inf2{
	@Override
	public void cat() {
		System.out.println("abs method overrided");
	}
	@Override
	public void fox() {
		System.out.println("inf fox() overrided");
	}
	@Override
	public void tiger() {
		System.out.println("inf tiger() overrided");
	}
	
	@Override
	public void book() {
		System.out.println("inf2 book() overrided");
	}
}


public class MultipleDemo {
public static void main(String[] args) {
	Impl obj= new Impl();
	obj.cat();
	obj.dog();
	obj.fox();
	obj.tiger();
	obj.book();
	
	
}
}
