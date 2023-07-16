package com.java3;
import java.util.*;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of matrix : ");
		int n=s.nextInt();
		int[][] mat1=new int[n][n];
		int[][] mat2=new int[n][n];
		int[][] result=new int[n][n];
		System.out.println("enter 1st matrix elements :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("enter ["+i+","+j+"] element : ");
				mat1[i][j]=s.nextInt();
			}
		}
		System.out.println("\nenter 2nd matrix elements :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("enter ["+i+","+j+"] element : ");
				mat2[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					result[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
		System.out.println("product of "+Arrays.deepToString(mat1)+" and "+Arrays.deepToString(mat2)+" is "+
		Arrays.deepToString(result));
		

	}

}
