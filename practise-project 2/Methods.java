package com.java;

import java.sql.Date;
import java.time.LocalDate;

public class Methods {

	public static void main(String[] args) {
		
		print();
		Bigger(10,20);
		System.out.println("Method with passing parameters and returning values : ");
		System.out.println("Lower number of 10 and 20 is : "+lower(10,20));
		System.out.println("Method with out passing parameters but returning values : ");
		System.out.println("Today's date is : "+getDate());
		

	}

	public static LocalDate getDate() {
		LocalDate date=LocalDate.now();
		return date;
	}

	public static int lower(int i, int j) {
		if(i<j) {
			return i;
		}
		return j;
	}

	public static void Bigger(int i, int j) {
		System.out.println("Method with passing parameters and no returning values : ");
		if(i>j) {
			System.out.println("Bigger number of 10 and 20 is : "+i);
		}
		else {
			System.out.println("Bigger number of 10 and 20 is : "+j);
		}
		
	}

	public static void print() {
		System.out.println("Method with no passing parameters and no returning values : ");
		System.out.println("I am a print method");
		
	}

}
