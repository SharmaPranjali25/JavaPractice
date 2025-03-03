package com.collectioncls;
import java.util.Enumeration;
import java.util.Stack;

public class Example3 {
 public static void main(String[] args) {
	 //RAW-TYPE COLLECTIONS
	 // dYNAMICALLY WE WILL GET TYPECASTING ISSUES (BECAUSE OF RAW DATA)
	 Stack data= new Stack();
	 
	    data.add(10);
		data.add("java");
		data.add(20);
		data.add("java");
		data.add(10);
		data.add(33.44f); 
		data.add(22.22d);
		data.add(8833l);
		data.add('A');
		data.add(false);
		System.out.println(data);
		System.out.println(data.peek()); //top element
		
		data.push("king");
		System.out.println(data.peek());
		System.out.println(data.pop());
		System.out.println(data.peek());
		
		//search method
		System.out.println(data.search(10)); //get the +ve members/ identification purpose
		System.out.println(data.empty()); //give the boolean value 
		// if value -> false else true (means empty)
		data.clear(); //object there data is removed
		System.out.println(data);
		System.out.println(data.empty()); //true
		
		//ENUMERATION
		Enumeration itr= data.elements();
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
		}
		
		//raw type-> no specific object
		//tO AVOID THIS WE HAVE GENEROUS
 }

}
