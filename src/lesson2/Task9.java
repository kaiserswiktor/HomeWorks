package lesson2;

import java.util.Scanner;

public class Task9 {// класс считающий факториал числа
	public void main(String args[]) {
		int a;
		long b = 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("введите натуральное число");

		if (scn.hasNextInt()) {

			a = scn.nextInt();

			for (int i = a; i > 0; i--) {
				b *= i;
			}
			System.out.println("факториал " + a + " числа " + b);
		} else
			System.out.println("неправильно введено число");

	}

}
