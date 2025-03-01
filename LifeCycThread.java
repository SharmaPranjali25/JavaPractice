package com.ths;

public class LifeCycThread extends Thread {
	//for thread application always override run method
	@Override
	public void run() {
		//System.out.println("run()");
		try {
			Thread.sleep(200); //200ms
			System.out.println("run()");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	public static void main(String[] args)  throws Exception
	{
		LifeCycThread t1= new LifeCycThread();
		System.out.println(t1.getName());
		
		System.out.println("Before starting thread state: "+ t1.getState());
		System.out.println("Before starting thread status: "+ t1.isAlive());
		
		t1.start();
		
		System.out.println("After starting thread state: "+ t1.getState());
		System.out.println("After starting thread status: "+ t1.isAlive());
		
		Thread.sleep(100);
		
		System.out.println("in sleep thread state: "+ t1.getState());
		System.out.println("in sleep  thread status: "+ t1.isAlive());
		
		t1.join();
		System.out.println("After joining thread state: "+ t1.getState());
		System.out.println("After joining thread status: "+ t1.isAlive());
	}
}


