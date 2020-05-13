package com.jit.thread10;

/*Program for sleep() method*/
public class SlideRotator {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Slide - "+i);
			Thread.sleep(5000);
		}
	}

}
