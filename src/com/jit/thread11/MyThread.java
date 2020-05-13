package com.jit.thread11;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy Thread");

				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I Got interrupted");
		}
	}
}
