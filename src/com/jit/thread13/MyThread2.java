package com.jit.thread13;

public class MyThread2 extends Thread {
	Display d;
	String name;
	public MyThread2(Display d) {
		this.d = d;
	}
	@Override
	public void run() {
		d.displayc();
	}
	
}
