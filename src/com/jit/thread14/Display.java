package com.jit.thread14;

public class Display {

	public void wish(String name) {
		for (int i = 0; i < 10; i++) {
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;/* 1 Lakh Line Of Code */
			synchronized (this) {
				System.out.print("Good Morning : ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.println(name);
			}
		}
	}

}
