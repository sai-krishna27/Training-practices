package com.dbmain;
import java.sql.SQLException;
import java.util.Scanner;

import com.crud.PlantCrudImpl;
import com.table.Plant;
public class DBAdmin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		PlantCrudImpl plantObj=new PlantCrudImpl();
		while(true) {
			
			System.out.println("Menu : 1. insert ,2. read ,3. update ,4. delete ,5. Exit");
			String ch=scan.next();
			switch(ch) {
			case "1" :
				System.out.println("Inserting row in to the table :");
				System.out.print("Enter plant id : ");
				int id=scan.nextInt();
				System.out.print("Enter plant name :");
				String name=scan.next();
				System.out.print("Enter fruit color : ");
				String color=scan.next();
				plantObj.insert(new Plant(id,name,color));
				break;
				
			
			case "2":
				plantObj.read();
				break;
			case "3":
				System.out.println("update a value in the table");
				System.out.print("Enter id : ");
				int id1=scan.nextInt();
				System.out.print("Enter new plant name : ");
				String name1=scan.next();
				plantObj.update(id1,name1);
				break;
				
				
			case "4":
				System.out.println("delete a row/record in the table");
				System.out.print("Enter id of row : ");
				int id2=scan.nextInt();
				plantObj.delete(id2);
				break;
			case "5":
				System.exit(0);
			}
		
		}

	}

}
