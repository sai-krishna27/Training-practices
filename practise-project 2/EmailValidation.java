package com.java;
import java.util.*;
public class EmailValidation {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String strArray[]= {"example@program.com","validation@email.com","array@abc.in"};
		System.out.println("Enter an Email address : ");
		String search=s.next();
		int flag=0;
		for(String i:strArray) {
			if(search.equals(i)) {
				System.out.println(search+" - This email is found in the database");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(search+" - This email is not found in the database");
		}
	}
}
