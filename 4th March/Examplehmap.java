package com.hmaps;

import java.util.HashSet;
import java.util.Iterator;

public class Examplehmap {
	public static void main(String[] args) {
		//Collection data= new HashSet();
		//Set data= new HashSet();
		HashSet data= new HashSet();
		data.add("java"); //call put method internally
		data.add(100);
		data.add('A');
		data.add("java");
		data.add(100);
		data.add(10);
		data.add(33.22f);
		data.add(22.22d);
		data.add(false);
		data.add("Pranjali");
		
		System.out.println(data);
		//listIterator only for list objects
		
		Iterator itr= data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//java8 new feature
		data.forEach(X-> System.out.println(X));
	}
}
