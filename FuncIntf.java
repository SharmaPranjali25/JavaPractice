package com.test;
@FunctionalInterface
interface FunInf{
	void greetUser();
	//void checkdata();
	//we can have n no. of static and default methods (JAVA-8 ONWARDS)
	static void human() {
		System.out.println("Static");
	}
	default void animal() {
		System.out.println("Default");
	}
	private void fox() {
		System.out.println("Private Method");
		
	}
}

public class FuncIntf {
	public static void main(String[] args) {
		//NO OBJECT FOR INTERFACE
		FunInf obj1= new FunInf() {
			@Override
			public void greetUser() {
				System.out.println("FunInf method overrided");
				
			}
			
		};
		obj1.greetUser();
		new FunInf() {
			@Override
			public void greetUser() {
				System.out.println("nameless object");
			}
			
		}.greetUser();
		
		//JAVA-8 FEATURE
		FunInf obj2= ()-> System.out.println("Java 8 new feature");
		// ()-> LAMBDA EXPRESSION 
		// Reactive programming and is Fast
		obj2.greetUser();
	}

}
