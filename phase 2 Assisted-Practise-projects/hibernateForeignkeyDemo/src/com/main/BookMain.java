package com.main;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.table.Author;
import com.table.Book;

public class BookMain {
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
		
		
		Query q1=s.createQuery("from Book");
		List<Book> books=q1.list();
		for(Book book:books) {
			System.out.println(book);
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book title");
		String titleOfBook=sc.next();
//		Author au=new Author();
//		au.setName("guptil");
//		au.setEmail("guptil@c.c");
//		s.save(au);
//		
//		Book book=new Book();
//		book.setTitle("python");
//		book.setAuthor(au);
//		s.save(book);
		Query q=s.createQuery("select a.name from Author a,Book b where a.id=b.id and b.title='"+titleOfBook+"'");
		List<String> list=q.list();
		System.out.println("authors of book "+titleOfBook+" are");
		for(String str:list) {
			System.out.println(str);
		}
		t.commit();
		s.close();
		sf.close();
	
	
}
}

