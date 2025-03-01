package com.test;
class Exp1{
	public void draw() {
		System.out.println("Circle");
	}
}

class Exp2 extends Exp1{
	public void draw() {
		System.out.println("Rectangle");
	}
	
}
public class MethodOverride{
	public static void main(String[] args) {
		Exp2 obj= new Exp2();
		obj.draw();
	}
}