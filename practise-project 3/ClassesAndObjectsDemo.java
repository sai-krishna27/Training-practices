package com.java2;

class ArithmeticOps{
	private int num1,num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	void add() {
		System.out.println("addition - "+(num1+num2));
	}
	void sub() {
		System.out.println("subtraction - "+(num1-num2));
	}
	
}

public class ClassesAndObjectsDemo {

	public static void main(String[] args) {
		ArithmeticOps object=new ArithmeticOps();
		object.setNum1(200);
		object.setNum2(100);
		object.add();
		object.sub();
	}

}
