package com.jit.thread06;
/*Program for join() method, Waiting main thread until completing child thread*/
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread t =new MyThread();
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
