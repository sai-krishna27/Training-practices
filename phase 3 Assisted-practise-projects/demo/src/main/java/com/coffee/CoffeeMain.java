package com.coffee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeMain {
	public static void main(String[] args) {
		ApplicationContext ac2=new ClassPathXmlApplicationContext("spring.xml");
		
		Capacino capacino=ac2.getBean(Capacino.class);
		capacino.rateOfCoffee();
		System.out.println("cream - "+capacino.getCream());
		
		
		Xpreso xpreso=ac2.getBean(Xpreso.class);
		xpreso.rateOfCoffee();
		System.out.println("cream - "+xpreso.getCream());
	}
}
