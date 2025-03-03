package com.ths;
//CALLABLE 

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ImplCall implements Callable<String>{ 
	//in place of string can give integer also
	@Override
	public String call() throws Exception {
	return "Callable will return something it is not void like runnable";
	}
}

public class CallableNew {
	static ExecutorService executor= Executors.newFixedThreadPool(2);
	public static void main(String[] args) throws Exception {
			
		//create and run callable task using thread class
		ImplCall task= new ImplCall();
		
		//SAtarting the task of callable interface and holding the values in future object
		Future<String> future= executor.submit(task);
		
	System.out.println(future.get().toString());
	//can use twisting in place of toString();  (object->value);
		
		executor.shutdown(); //it will stop task once execution is done
	}

}
