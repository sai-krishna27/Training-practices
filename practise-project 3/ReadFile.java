package com.java2;
import java.util.*;
import java.io.*;

public class ReadFile {
	  public static void main(String[] args) {
		  File file = new File("C:\\Users\\HP\\Desktop\\sai\\new file.txt");
		  try {
			  if(file.exists()) {
				  FileReader reader=new FileReader(file);
				  Scanner s=new Scanner(reader);
				  while(s.hasNextLine()) {
					  System.out.println(s.nextLine());
				  }
				  reader.close();
				  
				  
			  }
		  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
	  }
}
	    