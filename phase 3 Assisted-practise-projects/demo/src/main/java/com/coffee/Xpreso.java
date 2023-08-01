package com.coffee;

public class Xpreso implements Coffee{

	public String getCream() {
		return cream;
	}

	public void setCream(String cream) {
		this.cream = cream;
	}

	private String cream;
	
	public void typeOfCoffee() {
		System.out.println("type of coffee is xpreso");
		
	}

	public void rateOfCoffee() {
		System.out.println("cost of the xpreso coffee is 8$");
		
	}
	
}
