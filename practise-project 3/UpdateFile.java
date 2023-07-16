package com.java2;
import java.io.*;
import java.util.*;

public class UpdateFile {

	public static void main(String[] args) {
		
		
		File file=new File("C:\\Users\\HP\\Desktop\\sai\\new file.txt");
		Scanner s=new Scanner(System.in);
		try {
			if(file.exists()) {
				FileWriter writer=new FileWriter(file);
				System.out.println("Enter a string to replace");
				System.out.print("enter existing string : ");
				String old=s.next();
				System.out.print("enter string to replace : ");
				String newStr=s.next();
				String modified="",temp;
				Scanner reader=new Scanner(file);
				while(reader.hasNextLine()) {
					temp=reader.nextLine();
					//modified=modified+temp.replaceAll(old, newStr);
					//writer.write(modified);
				
				System.out.println("File updated successfully"+temp);
				}
				reader.close();
				writer.close();
				s.close();
			}
			else {
				System.out.println("file doesn't exists! ");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
