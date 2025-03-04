package com.hmaps;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp2 {
public static void main(String[] args) {
	TreeMap<String, Integer> data= new TreeMap<>();
	data.put("lenovo",300);
	data.put("sony", 450);
	data.put("dell", 300);
	data.put("asus", 750);
	data.put("apple", 570);
	data.put("ipad", 790);
	data.put("apple", 850); //this will override the previous apple(570)
	System.out.println(data.size());
	
	Iterator<Entry<String, Integer>> itr= data.entrySet().iterator();
	//1 way of iteration
	while(itr.hasNext()) {
		Entry<String, Integer> dt= itr.next();
		System.out.println("Product: "+dt.getKey()+ "Price: "+dt.getValue());
	}
	//2 way of iteration
	for(String k: data.keySet()) {
		System.out.println(k+" "+data.get(k));
	}
	//only values
	for(Integer x: data.values()) {
		System.out.println(x);
	}
	//java8 feature
	data.forEach((k,v)->System.out.println(k+" "+v));
	
}
}
