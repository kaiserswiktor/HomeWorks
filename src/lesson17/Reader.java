package lesson17;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Reader extends Thread {

	String threadname;
	Thread thread;
	Scanner scanner = new Scanner(System.in);
	static int s1;
	static String s2;

	Reader(String threadname) {
		this.threadname = threadname;
		thread = new Thread(this, threadname);
		System.out.println("New Thread:" + thread);
		thread.start();
	}

	public void run() {	
		entry();
		
	}

	public void entry() {
		
		System.out.println(threadname+" зашел в библиотеку ");
		System.out.println(
				"Выберите зал который хотите посетить: " + "\n" + "Если хотите посетить читальный зал введите:\t 1\n"
						+ "Если хотите посетить  зал абонемента введите:\t 2\n");
		s1 = scanner.nextInt();
		if (s1 == 1) {
			listforReadingRoom();
			

		} else if (s1 == 2) {
			listfoBookForMake();
			
		}
		
		
	}

	public void listforReadingRoom() {
		BookForReadingRoom book1 = new BookForReadingRoom("Война и мир", 230);
		CopyOnWriteArrayList<BookForReadingRoom> bookForReadingRoomList = new CopyOnWriteArrayList<BookForReadingRoom>();
		bookForReadingRoomList.add(book1);
		System.out.println(bookForReadingRoomList);
		System.out.println("Введите имя книги которую хотите взять почитать");
		scanner = new Scanner(System.in);
		s2 = scanner.nextLine();
       for(BookForReadingRoom o:bookForReadingRoomList){
    
		if (s2.equals(o.getName())) {
			System.out.println(threadname+" выбрал книгу"+o.getName());
			System.out.println(threadname+" пошел домой ");
		}}
	}

	public void listfoBookForMake() {
		BookForMake book1 = new BookForMake("Сказки", 230);

		CopyOnWriteArrayList<BookForMake> bookForBookForMakeList = new CopyOnWriteArrayList<BookForMake>();
		bookForBookForMakeList.add(book1);

		System.out.println(bookForBookForMakeList);
		scanner = new Scanner(System.in);
		s2 = scanner.nextLine();
       for(BookForMake o:bookForBookForMakeList){
    
		if (s2.equals(o.getName())) {
			System.out.println(threadname+" выбрал книгу "+o.getName());
			System.out.println(threadname+" пошел в зал ");
		}}
	}

	
	
	

	public static void main(String args[]) {
		new Reader("Читатель 1");
	}
}
