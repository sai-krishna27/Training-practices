package com.java2;
import java.io.File; 
import java.io.IOException;
import java.io.*;

public class FileCreate {
	public static void main(String[] args) {
      File file=new File("C:\\Users\\HP\\Desktop\\sai\\new file.txt");
      
      //creating file
      try {
		if(file.createNewFile()) {
			  System.out.println("New file created - "+file.getName());
		  }
		else {
			System.out.println("file already exists");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
