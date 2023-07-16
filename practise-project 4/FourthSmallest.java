package com.java3;
import java.util.*;
public class FourthSmallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.print("enter "+(i+1)+" element : ");
			arr.add(s.nextInt());
		}
		Collections.sort(arr);
		System.out.println("4th smallest element in the array is : "+arr.get(3));

	}

}
