package com.java2;

abstract class Car{
	int speed;
	abstract public void display();
	abstract public void calSpeed(int noOfHours);
}

class Lamborghini extends Car{

	@Override
	public void display() {
		
		System.out.println("My name is lamborghini");
	}

	@Override
	public void calSpeed(int noOfHours) {
		
		speed=250;
		System.out.println("I can cover "+(speed*noOfHours)+"KM in "+noOfHours+"hours");
	}
	
}
class Bugati extends Car{

	@Override
	public void display() {
		System.out.println("My name is Bugati");
		
	}

	@Override
	public void calSpeed(int noOfHours) {
		speed=230;
		System.out.println("I can cover "+(speed*noOfHours)+"KM in "+noOfHours+"hours");
		
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Lamborghini se18=new Lamborghini();
		Bugati ce13=new Bugati();
		System.out.println("-----Abstraction-----");
		se18.display();
		se18.calSpeed(6);
		ce13.display();
		ce13.calSpeed(6);

	}

}
