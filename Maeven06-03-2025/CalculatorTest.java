package com.test;
import static org.junit.Assert.assertEquals;
//run here
//  src/test/java
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
Calculator obj;
static int x,y;

@BeforeClass
public static void beforeClass() {
	System.out.println("Before all test cases only one time");
	x=10;
	y=50;
}

@AfterClass
public static void AeforeClass() {
	System.out.println("After all test cases only one time");
	x=0;
	y=0;
}

@Before
public void setUp() {
	System.out.println("Execute every test method before execution");
}

@After
public void setDown() {
	System.out.println("Execute every test after before execution");
}
@Test
public void testAdd() {
	System.out.println("testAdd method");
	int result=obj.add(x, y);
	assertEquals(60,result); //to check if we get same data or not
	
}
@Test
public void testSub() {
	System.out.println("testSub method");
	int result=obj.sub(x, y);
	assertEquals(-40,result);
	
}
@Test
public void testMul() {
	System.out.println("testMul method");
	int result=obj.mul(x, y);
	assertEquals(500,result);
}
@Test
public void testGreetUser() {
	System.out.println("testGreetUser method");
	assertEquals("hi hello",obj.greetUser("hi hello"));
	
}
}

/*
 * BeforeClass
 * Before
 * Test
 * After 
 * Before
 * Test
 * After
 * AfterClass
 * 
 * 
 * 
 */

OUPUT:   
Before all test cases only one time
Execute every test method before execution
testGreetUser method
Execute every test after before execution
Execute every test method before execution
testAdd method
Execute every test after before execution
Execute every test method before execution
testMul method
Execute every test after before execution
Execute every test method before execution
testSub method
Execute every test after before execution
After all test cases only one time


