package com.jit.producerconsumer;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> sharedList = null;
	final int MAX_SIZE = 5;
	private int i = 0;

	public Producer(List<Integer> sharedList) {
		this.sharedList = sharedList;
	}

	@Override
	public void run() {
		while (true) {
			try {
				produce(i++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.size() == MAX_SIZE) {
				System.out.println("Shared List is full....waiting for the consumer to consume");
				sharedList.wait();
			}
		}

		synchronized (sharedList) {
			System.out.println("Producer produced elemnt : "+i);
			sharedList.add(i);
			Thread.sleep(100);
			sharedList.notify();
		}
	}
}
