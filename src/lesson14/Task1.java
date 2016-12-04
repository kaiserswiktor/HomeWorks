package lesson14;

import java.util.Scanner;

public class Task1 extends Thread {
	
	String threadname;
	Thread thread;
	private static Scanner scanner;
     
	Task1(String threadname) {
		this.threadname = threadname;
		thread = new Thread(this, threadname);
		System.out.println("New Thread:" + thread);
		thread.start();
	}

	@Override
	public void run() {
		
			for (int i = 0; i < 10; i++) {

				System.out.print(threadname + ": " + (1 + (i * 10)) + " " + (2 + (i * 10)) + " " + (3 + (i * 10)) + " "
						+ (4 + (i * 10)) + " " + (5 + (i * 10)) + " " + (6 + (i * 10)) + " " + (7 + (i * 10)) + " "
						+ (8 + (i * 10)) + " " + (9 + (i * 10)) + " " + 10 * (i + 1) + '\n');

			
		}
	}

	public static void main(String args[]) throws InterruptedException {
		String start;
          String s1 ;
          s1="start";
          while(true){
          System.out.println("Введите слова -stаrt-для начала " );
		scanner = new Scanner(System.in);
		start = scanner.nextLine();
		
		
		if(start.equals(s1)){
		new Task1("Thread1");

		new Task1("Thread2");
		}
		else{
			System.out.println("неправильно введено слово -stаrt" );	
		}
	}
	}
}