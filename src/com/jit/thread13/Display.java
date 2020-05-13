package com.jit.thread13;

public class Display {
	
	public synchronized void displayn() {
		for(int i =0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
			}
		}
	}
	
	public synchronized void displayc() {
		for(int i =0;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
			}
		}
	}

}
