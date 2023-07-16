package com.java2;

import java.io.*;  

class M{  
	void method() throws IOException{  
		throw new IOException("device error");  
	}  
}  

public class ThrowsExceptionDemo{  
   public static void main(String args[]){  
	   try{  
		   	M m=new M();  
		    m.method();  
	   }
	   catch(Exception e){
		   System.out.println(e.getMessage());
	   }
	   finally {
		   System.out.println("All exceptions are handled");
	   }
	   
   }  
}  