package com.table;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("springJDBC.xml");
		 Student s=ac.getBean(Student.class);
	       StudentDao dao=ac.getBean(StudentDao.class);
	       Scanner sc=new Scanner(System.in);
	       
	       //insert
	       /*System.out.println("enter the id value ");
	       s.setId(sc.nextInt());
	       System.out.println("enter the name value");
	       s.setName(sc.next());
	       System.out.println("enter the email value");
	       s.setEmail(sc.next());
	       int row=dao.insert(s);
	       if(row>0) {
	    	   System.out.println("inserted successfully ");
	       }
	       else {
	    	   System.out.println("insertion failed ");
	       }*/
	       
	       
	       //delete
	       /*System.out.println("enter student id to delete");
	       dao.delete(sc.nextInt());*/
	       
	       
	       //update
	       System.out.println("enter student id to update student name");
	       int sid=sc.nextInt();
	       System.out.println("enter new student name");
	       String sname=sc.next();
	       dao.update(sid, sname);
	       
	       
	       
	       
	       List<Student> list=dao.getallstudents();
	       for(Student ss:list) {
	    	   System.out.println(ss);
	       }


	}

}
