package com.java2;


class Task extends Thread{
	public void run() {
		for(int z=1;z<=10;z++)
			System.out.print(z+" ");
		System.out.println("\nImplementing thread extended by Thread class");
	}
}

public class SleepWaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		//by extending thread
		Task thread1=new Task();
		int i=0;
		
		//implementation of sleep()
		thread1.sleep(1000);
		System.out.println("Thrad "+thread1+" awaken after 1 sec");

		//implementation of wait()
		synchronized(thread1)
		{
		thread1.wait(1000); 
		System.out.println("Task object has awaken after 1 sec");
		}

		thread1.start();
	
	}
}
