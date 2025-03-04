package com.hmaps;

import java.util.Iterator;
import java.util.TreeSet;
public class Linkhset {
public static void main(String[] args) {
	//be default in ascending
	TreeSet<String> data= new TreeSet<>();
	data.add("java");
	data.add("kohli");
	data.add("king");
	data.add("bye");
	data.add("cricket");
	data.add("hello");
	data.add("java");
	data.add("Ping");
	System.out.println(data);
	
	System.out.println(data.reversed());
	
	Iterator<String> itr= data.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		//java8 new feature
		data.forEach(x-> System.out.println(x));
		//give in alphabetically order
		System.out.println(data.subSet( "hello", "king")); 
		System.out.println(data.getFirst());
	
	}
	
}

