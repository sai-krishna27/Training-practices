package com.dbmain;

import java.sql.SQLException;
import java.util.Scanner;

import com.crud.BookCrud;
import com.table.Book;

public class BookAdmin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		BookCrud obj=new BookCrud();
		while(true) {
			System.out.println("Menu : 1.Insert 2.Read 3.Delete 4.Exit 5.author of book java");
			String ch=scan.next();
			switch(ch) {
			case "1":
				System.out.print("Enter book id : ");
				int id=scan.nextInt();
				System.out.print("Enter book title  : ");
				String name=scan2.nextLine();
				System.out.print("Enter author id : ");
				int author_id=scan.nextInt();
				obj.insert(new Book(id,name,author_id));
				break;
			case "2":
				obj.read();
				break;
			case "3":
				System.out.println("delete a book record by author id in the table");
				System.out.print("Enter id of row : ");
				int id2=scan.nextInt();
				obj.delete(id2);
				break;
			case "4":System.exit(0);
			case "5":
				obj.authorOfBookJava();
			}
			
		}
		
	}
	
}
