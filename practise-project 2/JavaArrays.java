package com.java;

import java.util.Arrays;

public class JavaArrays {

	public static void main(String[] args) {
		
		//1D array
		int[] array1=new int[5];
		for(int i=1;i<=5;i++) {
			array1[i-1]=i;
		}
		System.out.println("1D array is : "+Arrays.toString(array1)+" with a length of "+array1.length);
		
		//2D array
		int[][] array2=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				array2[i][j]=i+j+1;
			}
		}
		System.out.println("2D array is : "+Arrays.deepToString(array2)+" with a length of row "+array2.length+" and length of column "+array2[0].length);
		
	}

}
