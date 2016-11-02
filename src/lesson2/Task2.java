package lesson2;

import java.util.Scanner;

public class Task2 {// класс сравнивающий два введенных с клавиатуры числа
	private static Scanner scn;

	public static void main(String args[]) {
		double x, y;
		System.out.println("Введите первое число:");
		scn = new Scanner(System.in);
		x = scn.nextDouble();
		System.out.println("Введите второе число:");
		y = scn.nextDouble();
		if (x > y) {
			System.out.println("Первое число больше второго:");
		} else if (y > x) {
			System.out.println("Второе число больше первого:");
		} else
			System.out.println("Оба числа равны");
	}
}
