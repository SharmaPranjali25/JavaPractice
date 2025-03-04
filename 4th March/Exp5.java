package com.hmaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
	//1. Find(count of males and females employees present in company)
			public static void getCountOfMaleNFemale(List<Employee> employeeList) {
				Map<String, Long> result= employeeList.stream()
						               .collect(Collectors.groupingBy(Employee::getGender, 
						            		   Collectors.counting()));
				System.out.println(result);
				
			}
			
			//2. Write program to print name of all departments in company
			public static void getDeptNames(List<Employee> employeeList) {
				 employeeList.stream()
				              .map(Employee:: getDepartment)
				              .distinct() //for no duplicates
				              .forEach(System.out::println);		
				
			}
			//3. find the average age of male and female employees
			public static void getAverageGenderAge(List<Employee> employeeList) {
				Map<String, Double> avgData= employeeList.stream()
			               .collect(Collectors.groupingBy(Employee::getGender, 
			            		   Collectors.averagingInt(Employee:: getAge)));
	System.out.println(avgData);
	
				
			}
			
			//4. get the name of employees who joined after 2019
			public static void getNameOfEmployees(List<Employee> employeeList) {
				 employeeList.stream()
				             .filter(emp->emp.getYearofjoining()>2019)
			                .map(Employee:: getName)
			                .forEach(System.out::println);
			}
			//5. count number of employee
			public static void countByDept(List<Employee> employeeList) {
				Map<String, Long> cntResult= employeeList.stream()
						               .collect(Collectors.groupingBy(Employee::getDepartment, 
						            		   Collectors.counting()));
				cntResult.forEach((k,v)->System.out.println(k+" "+v));
				
			}
			
			//6 average salary of each department
			public static void getAverageSalaryOfDept(List<Employee> employeeList) {
				Map<String, Double> avgDataOfDept= employeeList.stream()
			               .collect(Collectors.groupingBy(Employee::getDepartment, 
			            		   Collectors.averagingDouble(Employee:: getSalary)));
				avgDataOfDept.forEach((k,v)->System.out.println(k+" -->"+v));
	
				
			}
			
			//7. Find the oldest Employee , his/her age and  department
			public static void oldestEmployeeAgeNDept(List<Employee> employeeList) {
				Optional<Employee> oldEmp= employeeList.stream()
						                .max(Comparator.comparing(Employee:: getAge));
			            
				Employee empData= oldEmp.get();
				System.out.println("Name: "+empData.getName());
				System.out.println("Age: "+empData.getAge());
				System.out.println("Department: "+empData.getDepartment());
				
			}
			
			//8. find out average and total salary of the company 
			public static void getAverageNTotalSal(List<Employee> employeeList) {
				DoubleSummaryStatistics empSalResult= 
						employeeList.stream()
						.collect(Collectors.summarizingDouble(Employee::getSalary));
				System.out.println("Avg Salary : "+ empSalResult.getAverage());
				System.out.println("Total Salary : "+ empSalResult.getSum());
		
				
			}
			
			//9. list down employees from each department
			public static void listEmpFromEachDept(List<Employee> employeeList) {
				Map<String, List<Employee>> empListDpt= 
						employeeList.stream()
			               .collect(Collectors.groupingBy(Employee::getDepartment));
				for(String k: empListDpt.keySet()) {
					System.out.println("Departments:: "+k);
					List<Employee> emp= empListDpt.get(k);
					for(Employee dt: emp) {
						System.out.println(dt);
					}
				}
				
			}
			//10. find out highest experience employee in company
			public static void getSeniorEmployee(List<Employee> employeeList) {
				Optional<Employee> seniorEmp=  
						employeeList.stream()
//		                .min(Comparator.comparing(Employee:: getYearofjoining));
						//another way
                         .sorted(Comparator.comparing(Employee::getYearofjoining)) 
                         .findFirst();
				Employee empData= seniorEmp.get();
				System.out.println("Senior most Employee from Company: ");
				System.out.println("======================="
						+ "");
				System.out.println("ID: "+ empData.getId());
				System.out.println("Name: "+ empData.getName());
				System.out.println("Age: "+ empData.getAge());
				
				
				

			
		
				
			}
			
			
	
	public static void main(String[]args) {
		
		
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
		
		Exp5.getCountOfMaleNFemale(empList); //1
		Exp5.getDeptNames(empList); //2
		Exp5.getAverageGenderAge(empList); //3
		Exp5.getNameOfEmployees(empList); //4
		Exp5.countByDept(empList); //5
		Exp5. getAverageSalaryOfDept(empList); //6
		Exp5. oldestEmployeeAgeNDept(empList); //7
		Exp5. getAverageNTotalSal(empList); //8
		Exp5. listEmpFromEachDept(empList); //9
		Exp5. getSeniorEmployee(empList); //10
		
		
		
		
		
		
		
	
		
	
	
	
	}

}
