package com.thread;
class ThreadsRunDemos implements Runnable{
	public void run() {
		try {
		System.out.println("list of threads running"+Thread.currentThread());
		
	}
		catch(Exception e) {
			System.out.println("Exception Caught"+e);
		}
}
}
public class ThreadsDemoByRun {
	public static void main(String args[]) {
		int numberOfthreads = 2;
		for(int i = 0;i<numberOfthreads;i++) {
			ThreadsDemos threadsdemo=new ThreadsDemos();
			threadsdemo.start();
			threadsdemo.setPriority(3);
			threadsdemo.setName("Anurag");
		}
	}

}
