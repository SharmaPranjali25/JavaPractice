package com.hmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.lang.String;

class Books{
	private int id;
	private String name;
	private String author;
	public Books() {
		
	}
	//Pram-Const
	public Books(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	//setter-getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}//formatted data 
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	
}


public class Exp4 {
public static void main(String[] args) {
	//MAP+list
	Map<String, List<Books>> bookData= new HashMap<>();
	//list we create
	List<Books> bdata1= new ArrayList<>();
	bdata1.add(new Books(101,"Core Java","James"));
	bdata1.add(new Books(102,"Adv Java","Omsri"));
	
//another object
	List<Books> bdata2= new ArrayList<>();
	bdata2.add(new Books(201, "Spring","Rodj"));
	bdata2.add(new Books(202,"MicroServices","Sanjay"));
	
	//object3
	List<Books> bdata3= new ArrayList<>();
	bdata3.add(new Books(301, "ECE","King"));
	bdata3.add(new Books(302,"COE","karan"));
	
	bookData.put("Software",bdata1);
	bookData.put("FrameWorks",bdata2);
	bookData.put("Departments",bdata3);
	
	Iterator<Entry<String, List<Books>>> itr= bookData.entrySet().iterator();
	while(itr.hasNext()) {
		Entry<String, List<Books>> et= itr.next();
		System.out.println("Department: "+ et.getKey());
		
		for(Books bd: et.getValue()) {
			System.out.println(bd.getId()+" "+bd.getName()+" "+bd.getAuthor());
		}
	}
	bookData.forEach((k,v)-> System.out.println(k+" "+v));
	
	
	
	
}
}
