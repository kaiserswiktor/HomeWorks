package lesson14;

public class Task2 extends Thread {
	String threadname;
	Thread thread;
	  boolean occupied = false;

	Task2(String threadname) {
		this.threadname = threadname;
		thread = new Thread(this, threadname);
		System.out.println("New Thread:" + thread);
		thread.start();
	}	
 public synchronized void print() {
	
	 for (int i = 0; i < 10; i++) {

			System.out.print(threadname + ": " + (1 + (i * 10)) + " " + (2 + (i * 10)) + " " + (3 + (i * 10)) + " "
					+ (4 + (i * 10)) + " " + (5 + (i * 10)) + " " + (6 + (i * 10)) + " " + (7 + (i * 10)) + " "
					+ (8 + (i * 10)) + " " + (9 + (i * 10)) + " " + 10 * (i + 1) + '\n');
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.notifyAll();
	 }
	
		
	 }
	
	 
 

	@Override
	public   void run()  {	
		print();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			}
	
					
	

	public static void main(String args[]) throws InterruptedException {
		new Task2("Theard1");
		
		new Task2("Theard2");
		
	}
}