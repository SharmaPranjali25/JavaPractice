package com.collectioncls;

import java.util.*;
import java.util.ArrayList;
public class example1 {
	public static void main(String[] args) {
		//methods-> create arrayList objects
		//Collection data= new ArrayList();
		//List data= new ArrayList();
		ArrayList data= new ArrayList();
		// data is collection framework variable
		data.add(10);
		data.add("java");
		data.add(20);
		data.add("java");
		data.add(10);
		data.add(33.44f); //data updating
		data.add(22.22d);
		data.add(8833l);
		data.add('A');
		data.add(false);
		
		System.out.println(data);
		System.out.println(data.size());
		//updates
		//data.set(index,value);
		
	    data.set(5,"Pranjali");
	System.out.println(data);
		//deletion
	data.remove(6); //6-> index
	System.out.println(data);
	System.out.println(data.size());
	
	//specific index value to get data
	System.out.println(data.get(5));
	
	//contains ->if available(true) else (false)
	System.out.println(data.contains(100)); // no 100 present so false
	
	//first and last values
	System.out.println(data.getFirst()+" "+data.getLast());
	
	//iterative way data getting
	
	//Iterator itr= data.iterator();
	ListIterator ltr= data.listIterator();	
	/*
	for(Object obj: data) {
		System.out.println(obj);
	}
	*/
	
	while(ltr.hasNext()) {
		System.out.println(ltr.next());
	}
	
	while(ltr.hasPrevious()) {
		System.out.println(ltr.previous());
	}
	//iterator is universal cursor
	//ArrayList is raw type collection
	
	
	
	
		
	}

}
