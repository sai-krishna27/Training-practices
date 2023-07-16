package com.java2;
import java.io.*;
import java.util.*;

public class WriteFile {
	  public static void main(String[] args) {
		  	File file=new File("C:\\Users\\HP\\Desktop\\sai\\new file.txt");
		  	try {
		  		if(file.exists()) {
		  			FileWriter writer=new FileWriter(file);
		  			writer.write("You can find something written in this file.");
		  			System.out.println("successfully written to the file");
		  			writer.close();
		  			
		  		}
		  		else {
		  			System.out.println("file not found!");
		  		}
		  	}
		  	catch(IOException e) {
		  		System.out.println("error occured!");
		  	}
	  }
}
