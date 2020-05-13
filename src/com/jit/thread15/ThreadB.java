package com.jit.thread15;

public class ThreadB extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculation");
			for (int i = 0; i < 100; i++) {
				total = total + i;
			}
			System.out.println("Child class giving notification");
			this.notify();
		}
	}

}
