package com.test;

public class StaticInstances {
	int id= 123123;
	static int pin= 3545;
	//dog->non static so we need object for this
	public void dog() {
		//non-static method
		System.out.println(id);
		//static->non-static using class name
		System.out.println(StaticInstances.pin);
	}
	public static void cat() {
		StaticInstances obj= new StaticInstances();
		System.out.println(obj.id);
		System.out.println();
	}
	public static void main(String[] args) {
		cat();
		StaticInstances obj= new StaticInstances();
		obj.dog();
		
	}
	

}
