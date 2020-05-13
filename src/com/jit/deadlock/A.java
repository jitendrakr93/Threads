package com.jit.deadlock;

public class A {
	
	public synchronized void d1(B b) {
		System.out.println("Thread1 starts execution of d1() method");
		try {
			Thread.sleep(6000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Threa1 trying to call B's last()");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A this is the last method");
	}

}
