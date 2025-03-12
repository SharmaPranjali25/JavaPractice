package com.test.main;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Customer;
import com.test.dao.CustDao;
public class StoreData {
public static void main(String[] args) {
	
	ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
	Customer obj= new Customer();
	
	obj.setId(2);
	obj.setName("Rahul");
	obj.setType("Occasional");
	
	CustDao cst= ctx.getBean("custDao", CustDao.class);
	
	//cst.createCustomer(obj);
	cst.updateCustomer(obj);
	System.out.println("Done");
	
	cst.deleteCustomer(obj);
	System.out.println("Done");
	
	List<Customer> data= cst.getAllCustomers();
	for(Customer cstd: data) {
		System.out.println(cstd);
	}
	
}
}
