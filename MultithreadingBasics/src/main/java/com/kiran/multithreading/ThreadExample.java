package com.kiran.multithreading;





class Thread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread1: "+i);
		}
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Thread2: "+i);
		}
	}
}

public class ThreadExample {
	
	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished the tasks...");
		 
	}
	
}

