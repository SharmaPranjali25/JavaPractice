package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {
public static void main(String[] args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	//ctx.getBean("emp");
	//Employee obj= (Employee)ctx.getBean("emp");	
	Employee obj= ctx.getBean("emp", Employee.class);
	System.out.println(obj);
	
	Employee obj1 = ctx.getBean("emp1",Employee.class);
	System.out.println(obj1);
	System.out.println(obj.getAobj());
	
	
}
}
