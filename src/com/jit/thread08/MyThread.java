package com.jit.thread08;

public class MyThread extends Thread {
	static Thread mt;

	@Override
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}

}
