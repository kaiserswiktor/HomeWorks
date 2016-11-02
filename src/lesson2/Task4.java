package lesson2;

import java.util.Scanner;

public class Task4 {// класс проверяющий год, и выводящий сообщение високосный
					// ли он
	private static Scanner scn;

	public static void main(String args[]) {
		int x;
		System.out.println("Введите год:");
		scn = new Scanner(System.in);
		x = scn.nextInt();
		if (x % 4 == 0) {
			if ((x % 100 != 0) || (x % 400 == 0))
				System.out.println("Данный год високосный");
		} else
			System.out.println("Данный год не високосный");
	}
}
