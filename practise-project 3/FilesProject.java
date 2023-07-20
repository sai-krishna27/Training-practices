package com.java2;

import java.io.*;
import java.util.*;

public class FilesProject {

	public static void main(String[] args) {

		File file=new File("files.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("New file created");
			}
			else {
				System.out.println("file already exists!");
			}
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		Scanner s=new Scanner(System.in);
		
		//writing to file
		System.out.println("--------------------------------------");
		System.out.println("Enter text to write into file : ");
		String str=s.nextLine();
		writeToFile(file,str);
		
		//appending data
		System.out.println("--------------------------------------");
		System.out.println("Enter text to append into file : ");
		str=s.nextLine();
		appendToFile(file,str);
		
		//reading data in file
		readFromFile(file);
		
		
		
	}
	
	private static void writeToFile(File file, String str) {
		
		try {
			if(file.exists()) {
				FileWriter writer=new FileWriter(file);
				writer.write(str);
				writer.close();
			}
			else {
				System.out.println("file does't exist");
			}
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}

	private static void readFromFile(File file) {
		
		try {
			if(file.exists()) {
				System.out.println("--------------------------------------");
				System.out.println("Reading data from file : "+file);
				Scanner reader=new Scanner(file);
				while(reader.hasNextLine()) {
					System.out.println(reader.nextLine()+"\n");
				}
				reader.close();
			}
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}

	private static void appendToFile(File file, String str) {
		
		try {
			if(file.exists()) {
				FileWriter writer=new FileWriter(file,true);
				writer.write(str);
				writer.close();
			}
			else {
				System.out.println("file does't exist");
			}
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
	}

	

}
