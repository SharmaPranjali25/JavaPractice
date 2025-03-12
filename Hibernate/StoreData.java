package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Skills skl1= new Skills();
		skl1.setS_name("spring");
		
		Skills skl2= new Skills();
		skl2.setS_name("Hibernate");
		
		List<Skills> listSkl= new ArrayList<>();
		listSkl.add(skl1);
		listSkl.add(skl2);
		
		Student std= new Student();
		std.setStd_name("Rohit");
		std.setSkills(listSkl);
		
		
		session.save(std);
		
		
		t.commit();
		
		//session.close();
		
		System.out.println("Done.");
		
	}

}

/*
 * one TO one relation (matching records the two tables there is no list type data)
 * ManytoOne(Left side table all the records right matching data)
 * ManyToMany(all the records from left side and all the records from right side )
 * OneToMany(left side only matching records and right side all the records )
 * 
 */
