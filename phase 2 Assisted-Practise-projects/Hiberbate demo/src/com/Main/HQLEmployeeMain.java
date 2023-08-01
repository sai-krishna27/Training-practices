package com.Main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.table.*;

/*
StandardServiceRegistry 
Metadata
SessionFactory
Session
Transaction
Close the connections

 * */
public class HQLEmployeeMain {
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
	/*for(int i=1;i<=10;i++) {
		Employee e=new Employee();
		e.setE_id(i);
		e.setE_name("name"+i);
		e.setE_email("name"+i+"@c.c");
		e.setE_salary(i*10000);
		s.save(e);
	}*/
	
	//select all in hql
//	Query q=s.createQuery("from Employee");
//	List<Employee> list=q.list();
//	for(Employee emp:list) {
//		System.out.println(emp);
//	}
	
	//select * from employee where salary=10000
//	Query q=s.createQuery("from Employee where salary=10000");
//	LHS employee object = RHS object
//	Employee e=(Employee) q.uniqueResult();
//	System.out.println(e);
	
	
	
	//select * from employee where salary>10000
//	Query q=s.createQuery("from Employee where salary>10000");
//	List<Employee> list=q.list();
//	for(Employee e:list) {
//		System.out.println(e);
//	}
	
	
	// select empname,empemail from employee where salary=10000
//	Query q=s.createQuery("select empname,empemail from Employee where salary=10000");
//	Object[] emp= (Object[]) q.uniqueResult();
//	System.out.println(emp[0]+" "+emp[1]) ;
	
	
	//select empname,empemail from employee where salary>10000
//	Query q=s.createQuery("select empname,empemail from Employee where salary>10000");
//	List<Object[]> emp=q.list();
//	for(Object e[]:emp) {
//		System.out.println(e[0]+"  "+e[1]);
//	}
	
//	Query q=s.createQuery("select empname from Employee where salary=10000");
//	String empname=(String) q.uniqueResult();
//	System.out.println(empname);
	
	
//	Query q=s.createQuery("select sum(salary) from Employee where salary>10000");
//	double sum=(double) q.uniqueResult();
//	System.out.println(sum);

	//update query by hql 
//	Query q=s.createQuery("update Employee set empname=:name where eid=:no");
//	q.setParameter("name","karthik");
//	q.setParameter("no", 1);
//	q.executeUpdate();

	
	
	t.commit();
	s.close();
	sf.close();
	sc.close();
	
	
}
}
