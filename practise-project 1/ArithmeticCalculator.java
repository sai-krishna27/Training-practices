package com.java;
import java.util.Scanner;
import java.math.*;
import java.io.*;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("-----Arithmetic Calculator-----");
		System.out.println("Enter first number : ");
		float num1=s.nextFloat();
		System.out.println("Enter second number : ");
		float num2=s.nextFloat();
		int flag=0;
		while(flag==0) {
			System.out.println("Enter any one operation '+' or '-' or '*' or '/' : ");
			String str=s.next();
			switch(str) {
				case "+" :
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					flag=1;
					break;
				case "-" :
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					flag=1;
					break;
				case "*" :
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					flag=1;
					break;
				case "/" :
					//try {
						System.out.println(num1+" / "+num2+" = "+(num1/num2));
					//}
					//catch(Exception e) {
					//	System.out.println("Divide by zero can't possible");
					//}
					//flag=1;
					break;
				default:
					System.out.println("Invalid operation");
					
			}
		}
	}

}
