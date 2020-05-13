package com.jit.thread04;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(17);
		Thread.currentThread().setPriority(7);
		MyThread t =new MyThread();
		System.out.println(t.getPriority());
		
	}

}
