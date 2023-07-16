package com.java2;
import java.util.*;
class MyException extends Exception{
	String exception;
	public MyException(String str) {
		exception=str;
	}
	public String toString() {
		return exception+" and ";
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			throw new MyException("MyException is created");
		}
		catch(MyException e){
			System.out.println(e+"Exception is handled");
			
		}
	}

}
