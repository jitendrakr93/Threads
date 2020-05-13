package com.jit.thread02;

public class ThreadDemo {

	public static void main(String[] args) {
		MyRunnable r =new MyRunnable();
		Thread thread =new Thread(r);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}

}
