package com.jit.thread15;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		ThreadB b =new ThreadB();
		b.start();
		synchronized(b) {
			System.out.println("Main thread calling wait method");
			b.wait();
			System.out.println("Main thraed got notification");
			System.out.println(b.total);
		}

	}

}
