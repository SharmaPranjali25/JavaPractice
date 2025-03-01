package com.voter;

public class AgeValidator {
	
	public void checkAge(int age) throws ValidAgeException,InvalidAgeException {
		if(age>=18) {
			ValidAgeException ve= new ValidAgeException("eligible");
			throw(ve);
		}
		else {
			InvalidAgeException ie= new InvalidAgeException("not eligible");
			throw(ie);
			
		}
	}
}
