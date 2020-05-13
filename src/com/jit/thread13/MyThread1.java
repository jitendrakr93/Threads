package com.jit.thread13;

public class MyThread1 extends Thread {
	Display d;
	String name;
	public MyThread1(Display d) {
		this.d = d;
	}
	@Override
	public void run() {
		d.displayn();
	}
	
}
