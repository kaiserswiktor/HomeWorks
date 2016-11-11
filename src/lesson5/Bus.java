package lesson5;

import java.util.Scanner;
public class Bus {

	private static Scanner scanner;
	static int y, x, z;

	public static void main(String args[]) {

		TaskBus bus[] = new TaskBus[5];
		bus[0] = new TaskBus("Никита ", "Кузьмин", "MAZ", 3, 1998, 23456);
		bus[1] = new TaskBus("Андрей", "Рубан", "MAZ", 8, 1997, 100000);
		bus[2] = new TaskBus("Сергей", "Витко", "VOLVO", 8, 2008, 23745);
		bus[3] = new TaskBus("Антон", "Апарович", "MERCEDES", 8, 2007, 234588);
		bus[4] = new TaskBus("Паша", "Урбанович", "MAZ", 3, 1999, 234500);
		System.out.println("Просмотреть весь автопарк: введите 1");
		System.out
				.println("Вывод списка автобусов для заданного маршрута: введите 2 ");
		System.out
				.println("Вывод списка автобусов,которые эксплатируются больше заданного срока: введите 3");
		System.out
				.print("Вывод списка автобусов,пробег которых больше заданного : введите 4");
		scanner = new Scanner(System.in);
		x = scanner.nextInt();
		if (x == 1) {
			for (int i = 0; i < 5; i++) {
				bus[i].show();
			}
		}
		if (x == 2) {
			System.out.println("Введите номер маршрута в форме (12) :");
			scanner = new Scanner(System.in);
			y = scanner.nextInt();
			for (int i = 0; i < 5; i++) {
				bus[i].nomer();
			}
		}
		if (x == 3) {
			System.out.println("Введите год в форме (1999)г. :");
			y = scanner.nextInt();
			for (int i = 0; i < 5; i++) {
				bus[i].god();
			}
		}
		if (x == 4) {
			System.out.println("Введите пробег в форме (100000) :");
			y = scanner.nextInt();
			for (int i = 0; i < 5; i++) {
				bus[i].probeg();
			}
		}
	}
}
