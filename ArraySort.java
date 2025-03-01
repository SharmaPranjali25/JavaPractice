package com.arrys;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
	public static void main(String[]args) {
		Integer [] arr= {1,4,2,6,3,9};
		System.out.println("Unsorted Array is : ");
		for(int x: arr) {
			System.out.print(x+ " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("Sorted arrays is: ");
		for(int y: arr) {
			System.out.print(y+" ");
		}
		String[] names= new String[5];
		names[0]="Java";
		
	int [][] arr1= new int[3][3];
	
	//Converting arrays->List
	System.out.println("Arrays to List: ");
	List<Integer> list=Arrays.asList(arr);
	
	Arrays.binarySearch(arr, 6);
	
	}

}

