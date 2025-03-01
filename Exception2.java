package comp.exp;

public class Exception2 {
public static void main(String[] args) {
	try {
		System.out.println(300/0);
	}
	
	catch(Exception e) {
		//using getMessage() it will give only exception message
		System.out.println(e.getMessage());
		//using exception class object it will give exception class name and message
		System.out.println(e);
// using this it will give exception class name, message and lined exception
		e.printStackTrace();
	}
}
}
