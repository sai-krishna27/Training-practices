package com.java;
import java.util.*;
public class StringsConcepts {

	public static void main(String[] args) {
	//creating string object
		String str="Strings concept";
		System.out.println("given string is : "+str);
		System.out.println("String operations :");
		System.out.println(str+"- contains 'con' : "+str.contains("con"));
		System.out.println(str+"- ends with '.' : "+str.endsWith("."));
		System.out.println(str+"- index of 'i' is : "+str.indexOf('i'));
		System.out.println(str+"- sub string between 0 and 7 : "+str.substring(0,7));
		System.out.println(str+"- upper case is : "+str.toUpperCase());
		
		//conversion to string buffer
		StringBuffer strBuff=new StringBuffer(str);
		strBuff.append(" to String Buffer");
		System.out.println("conversion of string to string buffer : "+strBuff);
		
		//conversion to string builder
		StringBuilder strBuild=new StringBuilder(str);
		strBuild.append(" to String Builder");
		System.out.println("conversion of string to string builder : "+strBuild);
	}

}
