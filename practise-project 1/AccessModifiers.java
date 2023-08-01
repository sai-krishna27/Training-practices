package com.java;

class AM{
	public int a;
	private int b;
	protected int c;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}

public class AccessModifiers {

	public static void main(String[] args) {
		
		AM am=new AM();
		
		//setting values to variables
		am.a=10;
		am.setB(11);
		am.c=12;
		
		//getting values of variables
		System.out.println("accessing public variable directly :- a= "+am.a);
		System.out.println("accessing protected variables using getter :- b="+am.getB());
		System.out.println("accessing protected variables with in a package :- c="+am.c);
		
	}

}
