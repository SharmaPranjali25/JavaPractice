package com.ths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class RunnableImpl implements Runnable{
	public void run() {
		System.out.println("run() from a different thread than Main");
	}
}
public class runnable {
	static ExecutorService executor= Executors.newFixedThreadPool(2);
	//2 means the thread number
	public static void main(String[] args) {
		
		
		//create and run runnable task using thread class
		RunnableImpl task= new RunnableImpl();
		Thread thread= new Thread(task);
		thread.start();
		//create and run runnable task using Executor Service
		executor.submit(task);
		executor.shutdown();
	}

}
