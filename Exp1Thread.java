package com.ths;

public class Exp1Thread extends Thread {
	@Override
	public void run() {
		System.out.println("run()");
	}
	public static void main(String[]args) {
		Exp1Thread t1= new Exp1Thread();
		Exp1Thread t2= new Exp1Thread();
		Exp1Thread t3= new Exp1Thread();
		
		System.out.println(t1.getName()+" "+t2.getName()+" "+ t3.getName());
		
		t1.setName("Transfer");
		t2.setName("Credit");
		t3.setName("Debit");
		
		System.out.println(t1.getName()+" "+t2.getName()+" "+ t3.getName());
	}

}
