package com.java2;

public class TryCatchDemo {

	public static void main(String[] args){
		int[] arr= {1,2};
		try {
			arr[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
