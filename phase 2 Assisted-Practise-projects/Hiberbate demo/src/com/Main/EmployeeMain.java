package com.Main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.table.*;

/*
StandardServiceRegistry 
Metadata
SessionFactory
Session
Transaction
Close the connections

 * */
public class EmployeeMain {
public static void main(String[] args) {
	//SSR is used to map the config file and execute it .
	StandardServiceRegistry  ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();	
	//Metadata of the xml file is read by this object
	Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
	//session-factory- db
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	//all the crud operations need to be done in Session 
	Session s=sf.openSession();
	//Transaction- perform sql operations and commit it permenantly on the db
	Transaction t=s.beginTransaction();
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
//	System.out.println("enter the eid");
//	e.setE_id(sc.nextInt());
//	System.out.println("enter the ename");
//	e.setE_name(sc.next());
//	System.out.println("enter the email");
//	e.setE_email(sc.next());
//	System.out.println("enter the salary");
//	e.setE_salary(sc.nextDouble());
	//s.save(e); 
	//s.delete(e);
	//s.saveOrUpdate(e);
	Employee emp=s.get(Employee.class,1);
	System.out.println(emp);
	t.commit();
	s.close();
	sf.close();
	sc.close();
	
	
}
}
