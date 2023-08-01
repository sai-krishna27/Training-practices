package com.dbmain;
import java.sql.SQLException;
import java.util.*;
import com.table.*;
import com.crud.*;

public class AuthorAdmin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		AuthorCrud obj=new AuthorCrud();
		while(true) {
			System.out.println("Menu : 1.Insert 2.Read 3.Update 4.Delete 5.Exit");
			String ch=scan.next();
			switch(ch) {
			case "1":
				System.out.print("Enter author id : ");
				int id=scan.nextInt();
				System.out.print("Enter author name  : ");
				String name=scan.next();
				System.out.print("Enter author email : ");
				String email=scan.next();
				obj.insert(new Author(id,name,email));
				break;
			case "2":
				obj.read();
				break;
			case "3":
				System.out.println("update a author email in the table");
				System.out.print("Enter author id : ");
				int id1=scan.nextInt();
				System.out.print("Enter new author email : ");
				String name1=scan.next();
				obj.update(id1,name1);
				break;
			case "4":
				System.out.println("delete a author record by author id in the table");
				System.out.print("Enter id of row : ");
				int id2=scan.nextInt();
				obj.delete(id2);
				break;
			case "5":System.exit(0);
			}
			
		}
	}

}
