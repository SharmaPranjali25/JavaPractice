package com.hmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

class Customer{
	private int id;
	private String name;
	private String city;
	private int age;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}

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
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, city, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
	
	
	

}
public class Exp3 {
	public static void main(String[]args) {
		
		HashMap<Customer, String> data= new HashMap<>();
		data.put(new Customer(101,"Kohli","Pune",36),"customer 1");
		data.put(new Customer(102,"Rohit","Mumbai",37),"customer 2");
		data.put(new Customer(103,"Rahul","Chennai",35),"customer 3");
		
		System.out.println(data);
		
		Iterator<Entry<Customer, String>> itr= data.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Customer, String> et= itr.next();
			System.out.println(et.getKey()+" "+et.getValue());
			
		}
		List<Customer> cntData= data.keySet().stream().toList();
	}

}
