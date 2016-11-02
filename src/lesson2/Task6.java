package lesson2;

import java.util.Scanner;

public class Task6 {// класс подставляющий слова рубль в правильной форме к
					// числам от 0 до 999

	private static Scanner scn;

	public static void main(String args[]) {
		int x;
		System.out.println("Введите число");
		scn = new Scanner(System.in);
		x = scn.nextInt();
		if ((x >= 0) && (x <= 999)) {
			if ((x == 11) || (x == 12) || (x == 13) || (x == 14)) {
				System.out.println(x + " рублей");
			} else if ((x == 1) || (x % 10 == 1)) {
				System.out.println(x + " рубль");
			} else if ((x % 10 == 5) || (x % 10 == 6) || (x % 10 == 7)
					|| (x % 10 == 8) || (x % 10 == 9) || (x % 10 == 0))
				System.out.println(x + " рублей");
			else if ((x % 10 == 2) || (x % 10 == 3) || (x % 10 == 4)) {
				System.out.println(x + " рубля");
			}
		} else
			System.out.println("Данное число не входит в диапазон работы");
	}
}
