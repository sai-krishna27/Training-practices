package com.java2;


class Thread1 extends Thread{
	public synchronized void run() {
		for(int z=1;z<=10;z++)
			System.out.print(z+" ");
		System.out.println("\nImplementing thread extended by Thread class");
	}
}
class Thread2 implements Runnable{

	public synchronized void run() {
		for(int z=11;z<=20;z++)
			System.out.print(z+" ");
		System.out.println("\nImplementing thread implemented my Runnable class");
	}
	
}

public class ThreadRunnable {
	
	public static void main(String[] args) throws InterruptedException {
		//by extending thread
		Thread1 thread1=new Thread1();
		thread1.start();
		
		//by implementing runnable
		Thread2 thread2=new Thread2();
		Thread t2=new Thread(thread2);
		t2.start();
	}
}
