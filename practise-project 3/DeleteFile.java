package com.java2;
import java.io.*;

public class DeleteFile {

	  public static void main(String[] args) {
		  	File file=new File("C:\\Users\\HP\\Desktop\\sai\\new file.txt");
		  	if(file.exists()) {
				file.delete();
				System.out.println("file "+file.getName()+" is deleted!");
			}
			else {
				System.out.println("file not found!");
			}
	  }
}
