package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {
	Customer obj;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before all test cases only one time");
		
	}
	@AfterClass
	public static void AfterClass() {
		System.out.println("After all test cases only one time");
		
	}
	@Before
	public void setUp() {
		System.out.println("Execute every test method before execution");
		obj= new Customer();
	}
	
	@After
	public void setDown() {
		System.out.println("Execute every test after before execution");
		obj= null;
	}
	
	
	@Test
	public void testGreetUser() {
		System.out.println("testgetName method");
		assertEquals("hi I am customer1",obj.getName("hi I am customer1"));
		
	}
}
