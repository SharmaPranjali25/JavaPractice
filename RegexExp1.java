package com.arrys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExp1 {
	public  static void main(String[] args) {
		Pattern formatD= Pattern.compile(".s");
		//find the matching data with input value
		Matcher matchD= formatD.matcher("bs");
		boolean b= matchD.matches();
		System.out.println(b);
		boolean b1= Pattern.compile(".s").matcher("dada").matches();
		boolean b2= Pattern.matches("..s", "aabcdd");
		System.out.println(b2);
		//..s exclude 1st two position
		System.out.println(Pattern.matches("[a-z]", "jkl"));
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}","jkl"));
	}
	//EMAIL VALIDATION
	public boolean validEmail(String email) {
		boolean validateEmail= Pattern.matches(
			"[_a-zA-Z0-9]+(\\.[A-Za-z0-9]*)*@[a-zA-Z0-9]+(\\.A-Za-z0-9)",email);
		return validateEmail;
		
	}
	public boolean valiDatePassword(String password) {
		String patternP= "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&%!])(?=\\S+$).{12,}";
		boolean passwordValidate= Pattern.matches(patternP, password);
		return passwordValidate;
	}


}
