package com.arrys;
class Student{
	private int id;
	private String name;
	private String City;
	//default constructor
	public Student() {
		
	}
	//parameterized Constructor
	public Student(int id, String name, String city) {
		this.id=id;
		this.name=name;
		this.City=city;
	}
	//setter-getter for private data
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
	public String getCity() {
		return name;
	}
	public void setCity(String City) {
		this.City = City;
	}
	//overriding
	@Override
	public String toString() {
		return "Student[id=" + id+", name="+name+ ", city="+City+ "]";
	}
	
}

public class ArrayDemo {
	public static void main(String[] args) {
		Student obj=  new Student();
		obj.setId(101);
		obj.setName("Pranjali");
		obj.setCity("Mandi");
		//call->parameterized constructor
		Student obj2 = new Student(102, "Rahul","Pune");
		//array creation
		Student[] stdData= {obj, obj2};
		
		for(int i=0;i<stdData.length;i++) {
			System.out.println(stdData[i]); //1D data
		}
		//enhanced for-loop
		for(Student obj1: stdData) {
			System.out.println(obj1);
			}
		
		
	}

}
