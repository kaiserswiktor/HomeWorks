package lesson2;

import java.util.Scanner;

public class Task3 {// класс, который находит частное двух чисел
	private static Scanner scn;

	public static void main(String args[]) {
		double x, y, z;
		System.out.println("Введите первое число:");
		scn = new Scanner(System.in);
		x = scn.nextDouble();
		System.out.println("Введите второе число:");
		{
			y = scn.nextDouble();
			z = x / y;
		}
		System.out.println("Частное этих двух чисел равно:" + z);
	}
}
