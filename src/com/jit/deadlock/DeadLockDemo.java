package com.jit.deadlock;

public class DeadLockDemo extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.d1(b);// This is executed by main thread
	}

	public void run() {
		b.d2(a);// THis is executed by child thread
	}
 
	public static void main(String[] args) {
		DeadLockDemo d =new DeadLockDemo();
		d.m1();
	}
}
