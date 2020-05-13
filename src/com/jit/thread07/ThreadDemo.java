package com.jit.thread07;
/*Program for join() method, Waiting child thread until completing main thread*/
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread.mt = Thread.currentThread();
		MyThread t =new MyThread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
