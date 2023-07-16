package com.java2;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		int var1=10;
		int var2=0;
		try {
			if(var2==0) {
				throw new ArithmeticException("invalid divion");
			}
			else {
				System.out.println(var1/var2);
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
