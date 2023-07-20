package com.table;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class StudentMain
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("springHibernate.xml");
        Student s=ac.getBean(Student.class);
        StudentDao dao=ac.getBean(StudentDao.class);
        Scanner sc=new Scanner(System.in);
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
        }
        
        
        List<Student> list=dao.getall();
        for(Student ss:list) {
     	   System.out.println(ss);
        }
    }
}

