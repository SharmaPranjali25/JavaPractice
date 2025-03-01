package com.test;
class A{
	
	public void method1() {
		System.out.println("Parent");
	}
}
class B extends A{
	public void method2() {
		System.out.println("First-Child of A");
	}
	
}
//multi-level inheritance
class C extends B{
	public void  method3() {
		System.out.println("Child of B ");
	}
}
	

public class MultipleInht {
	public static void main(String[] args) {
		C obj2= new C();
		obj2.method1();
		
	}
}




