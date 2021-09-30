package com.thread;

class ThreadsDemos extends Thread {

	public void run() { // imp method given by thread class java

		try {
			System.out.println("list of threads running " + Thread.currentThread());
		} catch (Exception e) {

			System.out.println("exception caught" + e);

		}

	}

}

public class ThreadsDemo {

	public static void main(String ar[]) {

		int numberOfThreads = 2;

		for (int i = 0; i < numberOfThreads; i++) {

			ThreadsDemos threadsDemos = new ThreadsDemos();

			threadsDemos.start();// life cycle of threads start() call the run method
			threadsDemos.setName("Anurag");
			threadsDemos.setPriority(3);

		}

	}

}