package com.test;
class Book{
	protected void finalize() {
		System.out.println("Object going -> Garbage Collection");
	}
	public static Book getInstance() {
		return new Book();
	}
	public void disp() {
		System.out.println("Test Finalize Method");
	}
}
	

public class ObjectNGc {
	public static void main(String[] args) {
		Book b1= Book.getInstance();
		Book b2= Book.getInstance();
		System.out.println(b1.hashCode() +" "+  b2.hashCode());
		b1.disp();
		b1=null;
		System.out.println("after object null reference");
		System.gc();
		System.out.println("After gc Execution");
		
		
	}

}
