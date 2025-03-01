
package com.test;
import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		//for loop even numbers
		System.out.println("Even numbers: ");
		int arr[]= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}

		}
		System.out.println("Odd numbers: ");
		// while loop
		int arr2[]= {1,2,3,4,5,6};
		int l=arr2.length; 
		//int x=0;
		int i=0;
		while(l>i) {
			if(arr2[i]%2!=0) {
				System.out.println(arr2[i]);
				i++;
			}
			else {
				i++;
			}
		
		}
		
		//check whether even or prime:
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x= sc.nextInt();
		if(x%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd Number");
		}
		
	}

}
