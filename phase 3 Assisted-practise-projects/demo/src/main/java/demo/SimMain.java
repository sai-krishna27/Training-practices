package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimMain {
public static void main(String[] args) {
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Airtel airtel=ac.getBean(Airtel.class);
	/*airtel.dataTypeOfSim();
	airtel.typeOfSim();*/
	airtel.getSpeed();
	
	Idea idea=ac.getBean(Idea.class);
	idea.getSpeed();
	

	
	
/*	Not recommended with config defining in the code 
 * Airtel airtel =new Airtel();
	airtel.dataTypeOfSim();
	airtel.typeOfSim();*/
}
}
