package com.voter;
import java.util.Scanner;
public class TestException {
public static void main(String[] args) throws ValidAgeException, InvalidAgeException {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter age");
	int age= sc.nextInt();
	AgeValidator obj= new AgeValidator();
	obj.checkAge(age);
}
}
