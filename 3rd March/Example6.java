package com.collectioncls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//use of comparable
class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int age;
	//constructor
	public Student() {
		
	}
	//parameterized constructor
	public Student(int id, String name,  int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	//setters and getters
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Student [id="+ id+",name=" + name+ ", age="+ age+ "]";
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	
	}
	
	
}



public class Example6 {
public static void main(String[] args) {
	List<Student> stdList= new ArrayList<>();
	
	stdList.add(new Student(5,"Alice",33));
	stdList.add(new Student(3,"Bob",35));
	stdList.add(new Student(4,"Eve",30));
	stdList.add(new Student(1,"Kavya",12));
	System.out.println("before sorting data");
	stdList.forEach(emp-> System.out.println("ID: "+emp.getId()+" Name: "+ emp.getName()+  "Age: "+ emp.getAge()));
	
	//SORTING by java8 new feature -> stream API
	//Student:: is method reference
	//sort+reverse
	List<Student> frmtData= stdList.parallelStream()
			.sorted(Comparator.comparing(Student:: getId).reversed())
			.collect(Collectors.toList());
	System.out.println("After Sorting data");
	frmtData.forEach(emp-> System.out.println("ID: "+emp.getId()+" Name: "+ emp.getName()+  "Age: "+ emp.getAge()));
	
/*
 * //its replacement is java8 new feature
	Student std= new Student();
	std.getId();
	*/  
	//its replacement is java8 new feature
}
}
