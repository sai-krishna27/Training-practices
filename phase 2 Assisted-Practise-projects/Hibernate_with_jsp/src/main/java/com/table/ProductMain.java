package com.table;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class ProductMain {

	public int addProduct(Product product) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int row=(int) s.save(product);
		t.commit();
		s.close();
		sf.close();
		return row;
		
	}
	
	public void deleteProduct(int id) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("from Product where id="+id);
		Product product=(Product) q.uniqueResult();
		s.delete(product);
		t.commit();
		s.close();
		sf.close();
		
	}
	
	public void updateName(String id,String name) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("update Product set name='"+name+"' where id="+Integer.parseInt(id));
		q.executeUpdate();
		t.commit();
		s.close();
		sf.close();
		
	}
	
	public void updateType(String id,String name) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("update Product set type='"+name+"' where id="+Integer.parseInt(id));
		q.executeUpdate();
		t.commit();
		s.close();
		sf.close();
		
	}
	
	public void updateDate(String id,String date) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		//update product set manufacturing_date=date("2022-03-05") where id=1;
		Query q=s.createQuery("update Product set manufacturing_date=date('"+date+"') where id="+Integer.parseInt(id));
		q.executeUpdate();
		t.commit();
		s.close();
		sf.close();
		
	}

	public List<Product> getProducts() {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("from Product");
		List<Product> products=q.list();
		t.commit();
		s.close();
		sf.close();
		return products;
	}


}
