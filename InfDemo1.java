package com.test;
interface Inf5{
	void human();
	void animal();
}
interface Inf6{
	void dog();
	void cat();
}
interface Inf7{
	void book();
	void color();
}
interface Inf8 extends Inf5, Inf6, Inf7{
	//abstract method
	void dance();
	//total 7 methods in Inf8
}

class Impl1 implements Inf8, Inf7, Inf6, Inf5{ //can use only Inf8 also 
	//all method are public inside interface
	@Override
	public void dance() {
		System.out.println("Inf8 overrided");
	}
	@Override
	public void human() {
		System.out.println("Inf5 overrided");
	}
	@Override
	public void animal() {
		System.out.println("Inf5 animal overrided");
	}
	@Override
	public void dog() {
		System.out.println("Inf6 dog overrided");
	}
	@Override
	public void cat() {
		System.out.println("Inf6 cat overrided");
	}
	@Override
	public void book() {
		System.out.println("inf7 book overrided");
	}
	@Override
	public void color() {
		System.out.println("inf7 color overrided");
	}
}


public class InfDemo1 {
	public static void main(String[] args) {
		Impl1 obj= new Impl1();
		obj.dance();
		obj.human();
		obj.animal();
		obj.dog();
		obj.cat();
		obj.book();
		obj.color();
		                                                                                                          
	}

}
