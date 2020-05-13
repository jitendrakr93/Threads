package com.jit.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> sharedList = null;
	

	public Consumer(List<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void consume() throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.isEmpty()) {
				System.out.println("Shared List is empty....waiting for the producer to produce");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			Thread.sleep(1000);
			System.out.println("Consumed the element :"+ sharedList.remove(0));
			sharedList.notify();
		}
	}
}
