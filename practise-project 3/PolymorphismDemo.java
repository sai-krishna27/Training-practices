package com.java2;

class Additions{
	
	//three overloaded methods with same method name
	void add(int a,int b,int c) {
		System.out.println("addition of 3 values : "+(a+b+c));
	}
	void add(int a,int b,int c,int d) {
		System.out.println("addition of 4 values : "+(a+b+c));
	}
	void add(int a,int b) {
		System.out.println("addition of 2 values : "+(a+b));
	}
	
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Additions ops=new Additions();
		ops.add(10,20,30,40);
		ops.add(56, 78);
		ops.add(54, 71, 23);
		
	}

}
