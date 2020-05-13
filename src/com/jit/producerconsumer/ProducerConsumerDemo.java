package com.jit.producerconsumer;
/*https://www.youtube.com/watch?v=EtJALCEIxDs*/
import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<Integer>();
		Thread thread1 = new Thread(new Producer(sharedList));
		Thread thread2 = new Thread(new Consumer(sharedList));
		thread1.start();
		thread2.start();
	}

}
