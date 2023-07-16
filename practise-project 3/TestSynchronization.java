package com.java2;

class Table{  
	void printTable(int n){//method not synchronized  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(1000);  
			}
			catch(Exception e){
				System.out.println(e);
			}  
		}  
  
	}  
}  
  
class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
		this.t=t;  
	}  
	public synchronized void run(){  
		t.printTable(5);  
	}  
  
}  
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  
  
public class TestSynchronization{  
	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();  
		System.out.println("There two threads are synchronized with each other over a time lapse");
	}  
}  