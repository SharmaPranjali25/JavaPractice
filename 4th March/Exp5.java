package com.hmaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;



class Employee{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearofjoining;
	double salary;
	public Employee(){
		
	}
	public Employee(int id, String name, int age, String gender, String department, int yearofjoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofjoining = yearofjoining;
		this.salary = salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearofjoining=" + yearofjoining + ", salary=" + salary + "]";
	}
	
	
}
public class Exp5 {
	//list->Map
			public static void getCountOfMaleNFemale(List<Employee> employeeList) {
				Map<String, Long> result= employeeList.stream()
						               .collect(Collectors.groupingBy(Employee::getGender, 
						            		   Collectors.counting()));
				System.out.println(result);
				
			}
			
	
	
	
	
	public static void main(String[]args) {
		//1. Find(count of males and females employees present in company)
		
	
		
		
		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee(111,"Pranjali",32,"Female","HR",2011,25000.0));
		empList.add(new Employee(122,"Alice",25,"Female","sales marketing",2015, 13500.0));
		empList.add(new Employee(133,"Bob",29,"Male","Product Development",2014,32500.0));
		empList.add(new Employee(144,"Eve",35,"Male","HR",2016,11500.0));
		empList.add(new Employee(155,"Mehak",19,"Female","Infrastructure",2020,28900.0));
		empList.add(new Employee(166,"Jyothi",35,"Female","Security and Transport",2013,27000.0));
		empList.add(new Employee(177,"Nitin Kaushal",45,"Male","Finance Accounting",2011,13500.0));
		empList.add(new Employee(188,"Sanvi Panday",23,"Female","Infrastructure",2018,34500.0));
		empList.add(new Employee(199,"Anuj",31,"Male","Product Development",2012,11600.0));
		empList.add(new Employee(200,"Jaden Dough",31,"Male","HR",2020,35700.0));
		
		Exp5.getCountOfMaleNFemale(empList);
		
		
		
		
	
	
	
	
	}

}
