package com.arrys;

public class ReverseStr {
	public static void main(String[] args) {
		String str="PRANJALI";
		String reverse="";
		char ch;
		for(int i=0; i<str.length();i++) {
			ch=str.charAt(i);
			reverse=ch+reverse;
		}
	System.out.println(reverse);
	}

}
