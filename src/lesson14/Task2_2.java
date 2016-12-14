package lesson14;

import java.util.concurrent.Semaphore;

public class Task2_2 extends Thread {
	Semaphore sem=new Semaphore(1);
	String threadname;
	Thread thread;
	

	Task2_2(String threadname,Semaphore sem) {
		this.threadname = threadname;
		this.sem=sem;
		thread = new Thread(this, threadname);
		System.out.println("New Thread:" + thread);
		thread.start();
	}

	@Override
	public synchronized void run() {
		
			for (int i = 0; i < 10; i++) {

				System.out.print(threadname + ": " + (1 + (i * 10)) + " " + (2 + (i * 10)) + " " + (3 + (i * 10)) + " "
						+ (4 + (i * 10)) + " " + (5 + (i * 10)) + " " + (6 + (i * 10)) + " " + (7 + (i * 10)) + " "
						+ (8 + (i * 10)) + " " + (9 + (i * 10)) + " " + 10 * (i + 1) + '\n');
           try {
			sem.acquire();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			sem.release();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}	
			
	}

	public static void main(String args[]) throws InterruptedException {
		Semaphore sem=new Semaphore(1);
		new Task2_2("Thread1", sem);
		
		new Task2_2("Thread2",sem);
		
		
	}
}
