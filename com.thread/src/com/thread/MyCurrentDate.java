package com.thread;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class DateTime {
	public void printdatetime(String message) {
		for (int i = 0; i <= 10; i++) {
			DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime datetime = LocalDateTime.now();
			System.out.println(message + " Date " + i + " times : " + datetimeformatter.format(datetime));
			try {
				Thread.sleep(5000 );

			} catch (Exception e) {
				System.out.println("exception caught" + e);
			}
		}
	}
}

class MyCurrentDate implements Runnable {
	String msg = "First Thread";
	DateTime datetime;

	MyCurrentDate(DateTime datetime) {
		this.datetime = datetime;
	}

	public void run() {
		datetime.printdatetime(msg);
	}
}

//Second
class MyCurrentDate2 implements Runnable {
	String msg = "Second Thread";
	DateTime datetime;

	MyCurrentDate2(DateTime datetime) {
		this.datetime = datetime;
	}

	public void run() {

		datetime.printdatetime(msg);
	}

}

//Third
class MyCurrentDate3 implements Runnable {
	String msg = "Third Thread";
	DateTime datetime;

	MyCurrentDate3(DateTime datetime) {
		this.datetime = datetime;
	}

	public void run() {

		datetime.printdatetime(msg);
	}

}

class MyMain {

	public static void main(String args[]) {

		DateTime dateandtime = new DateTime();
		MyCurrentDate myCurrentDate = new MyCurrentDate(dateandtime);
		Thread thread = new Thread(myCurrentDate);

		// For second thread
		MyCurrentDate2 myCurrentDate2 = new MyCurrentDate2(dateandtime);
		Thread thread2 = new Thread(myCurrentDate2);

		// For third thread
		MyCurrentDate3 myCurrentDate3 = new MyCurrentDate3(dateandtime);
		Thread thread3 = new Thread(myCurrentDate3);

		thread.start();
		thread2.start();
		thread3.start();

	}
}
