package com.jit.thread12;

public class Display {
	
	public synchronized void wish(String name) {
		for(int i =0;i<10;i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(name);
		}
	}

}
