package lesson14;

public class Task2 extends Thread {
	String threadname;
	Thread thread;
	

	Task2(String threadname) {
		this.threadname = threadname;
		thread = new Thread(this, threadname);
		System.out.println("New Thread:" + thread);
		thread.start();
	}

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {

				System.out.print(threadname + ": " + (1 + (i * 10)) + " " + (2 + (i * 10)) + " " + (3 + (i * 10)) + " "
						+ (4 + (i * 10)) + " " + (5 + (i * 10)) + " " + (6 + (i * 10)) + " " + (7 + (i * 10)) + " "
						+ (8 + (i * 10)) + " " + (9 + (i * 10)) + " " + 10 * (i + 1) + '\n');
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	public static void main(String args[]) throws InterruptedException {
		new Task2("Thread1");

		new Task2("Thread2");

	}
}