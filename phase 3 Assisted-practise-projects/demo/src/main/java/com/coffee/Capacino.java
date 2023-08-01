package com.coffee;

public class Capacino implements Coffee{
	
	public String getCream() {
		return cream;
	}

	public void setCream(String cream) {
		this.cream = cream;
	}

	private String cream;

	public void typeOfCoffee() {
		System.out.println("type of coffee is capacino");
		
	}

	public void rateOfCoffee() {
		System.out.println("cost of the capacino coffee is 8$");
		
	}
	
	
	
	
}
