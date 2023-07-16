package com.java;

public class Constructors {
	
	String name;
	int id;
	
	//parameterized constructor
	public Constructors(String name, int id) {
		
		this.name=name;
		this.id=id;
	}
	
	//non parameterized constructor
	public Constructors() {
		name="construtor2";
		id=2;
	}

	public static void main(String[] args) {
		
		Constructors con1=new Constructors("constructor1",1);
		Constructors con2=new Constructors();
		System.out.println("parameterized constructor values");
		System.out.println("name = "+con1.name+"\nid = "+con1.id);
		System.out.println("non parameterized constructor values");
		System.out.println("name = "+con2.name+"\nid = "+con2.id);
		System.out.println("Constructors are implemented");
	}

}
