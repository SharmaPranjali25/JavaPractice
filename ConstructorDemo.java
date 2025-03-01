package com.test;
class Employee {
public Employee() {	
	System.out.println("Default Constructor");
}

public Employee(int x, String str) {
	System.out.println("Parametrized constructor");
}

public Employee(Employee obj) {
	System.out.println("Object-Parameterized Const");
}

//NEW TERMS
//Factory Method

public Employee getObj(Employee emp) {
	if(emp==null) {
		emp = new Employee();
	}
	System.out.println("Object Created");
	return emp;
}
public Employee getInstance() {
	return new Employee();
}
}
public class ConstructorDemo {
public static void main(String[] args) {
	Employee obj1= new Employee();
	
	Employee obj3= new Employee(10, "Java");
	
	Employee obj2= new Employee(obj1);
	Employee obj4 =obj1.getObj(obj2);
	
	
}
}
