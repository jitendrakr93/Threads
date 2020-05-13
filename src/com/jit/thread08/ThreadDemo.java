package com.jit.thread08;
/*Program for join() method, If main thread calls join() method on child thread object 
  and child thread class join() method on main thread object then both threads will wait
  forever and program will be stuck*/
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread.mt = Thread.currentThread();
		MyThread t =new MyThread();
		t.start();
		t.join();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
