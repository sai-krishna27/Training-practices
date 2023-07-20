package com.java;

public class InnerClasses {

	public static void main(String[] args) {
		InnerClasses inner=new InnerClasses();
		InnerClasses.Display out=inner.new Display();
		out.print();
	}	
	
	
	class Display{
		void print() {
			System.out.println("Implemented inner class");
		}
	}

	

}
