package lesson17;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Reader extends Thread {

	String threadname;
	Thread thread;
	Scanner scanner = new Scanner(System.in);
	static int s1;
	static String s2=null;
	static String s3=null;
	Reader(String threadname) {
		this.threadname = threadname;
		thread = new Thread(this, threadname);
		System.out.println("New Thread:" + thread);
		thread.start();
	}

	public void run() {
		System.out.println(threadname + " зашел в библиотеку "+"\n");
		System.out.println("Выберите зал который хотите посетить: " + "\n" );
		while(true){
		entry();
			if (s1 == 1) {
				listforReadingRoom();

			} else if (s1 == 2) {
				listfoBookForMake();

			}
			else if (s1 == 3) {
				
			}
			else if (s1 == 4) {
				return;
			}
		}
		
	}

	
	public void entry(){
		
		System.out.println( "Если хотите посетить читальный зал введите:\t 1\n"
				+ "Если хотите посетить  зал абонемента введите:\t 2\n"
			    +"Если хотите выйти из библиотеки введите:\t 4" );
		s1 = scanner.nextInt();	
	}
	

	public void listforReadingRoom() {
		BookForReadingRoom book1 = new BookForReadingRoom("Война и мир", 230);
		CopyOnWriteArrayList<BookForReadingRoom> bookForReadingRoomList = new CopyOnWriteArrayList<BookForReadingRoom>();
		bookForReadingRoomList.add(book1);
		System.out.println("Каталог книг: "+bookForReadingRoomList);
		System.out.println("Введите имя книги которую хотите взять почитать");
		scanner = new Scanner(System.in);
		s2 = scanner.nextLine();
		for (BookForReadingRoom o : bookForReadingRoomList) {

			if (s2.equals(o.getName())) {
				System.out.println(threadname + " выбрал книгу " + o.getName());
				System.out.println(threadname + " пошел в зал ");
				entry();
			}
		}
	}

	public void listfoBookForMake() {
		BookForMake book1 = new BookForMake("Сказки", 230);

		CopyOnWriteArrayList<BookForMake> bookForBookForMakeList = new CopyOnWriteArrayList<BookForMake>();
		bookForBookForMakeList.add(book1);

		System.out.println("Каталог книг: "+bookForBookForMakeList);
		scanner = new Scanner(System.in);
		s2 = scanner.nextLine();
		for (BookForMake o : bookForBookForMakeList) {

			if (s2.equals(o.getName())) {
				System.out.println(threadname + " выбрал книгу " + o.getName());
				System.out.println(threadname + " пошел домой ");
			}
		}
	}
	public void f(){
		
	}

	public static void main(String args[]) {
		new Reader("Читатель 1");
	}
}
