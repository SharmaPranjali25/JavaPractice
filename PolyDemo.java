package com.test;
class Parent1{
	public void draw() {
		System.out.println("Square->Parent1");
	}
}
class Child1 extends Parent1{
	//@override
	public void draw() {
		System.out.println("Circle->Child1");
	}
}
class Child2 extends Parent1{
	//@override
	public void draw() {
		System.out.println("Rectangle->Child2");
	}
}
public class PolyDemo {
	public static void main(String[] args) {
		Parent1 obj1= new Parent1();
		obj1.draw();
		
		Parent1 obj3= new Child1();
		obj3.draw();
		
		
		Child2 obj2= new Child2();
		obj2.draw();
	}

}
