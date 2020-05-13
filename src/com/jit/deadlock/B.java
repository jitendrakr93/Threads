package com.jit.deadlock;

public class B {
	
	public synchronized void d2(A a) {
		System.out.println("Thread2 starts execution of d2() method");
		try {
			Thread.sleep(6000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Threa2 trying to call A's last()");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B this is the last method");
	}

}
