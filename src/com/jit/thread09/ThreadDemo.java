package com.jit.thread09;
/*Program for join() method, If a thread calls join() method on same thread itself  
  the the program will be stucked, In this case thread has to wait infinite time*/
public class ThreadDemo extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
