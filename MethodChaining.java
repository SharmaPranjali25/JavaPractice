package com.test;

public class MethodChaining {
public static void main(String[] args) {
	ExpM obj= new ExpM();
	obj.method1();
}
}
class ExpM{
	public void method1() {
		System.out.println("Method1");
		method2();
	}
	public void method2()
{
	System.out.println("Method2");
	method3();
}
	public void method3(){
		System.out.println("Method3");
	}
}

