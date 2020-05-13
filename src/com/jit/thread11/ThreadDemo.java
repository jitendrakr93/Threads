package com.jit.thread11;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}

}
