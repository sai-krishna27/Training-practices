package com.java4;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {45,98,12,34,51,5};
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
