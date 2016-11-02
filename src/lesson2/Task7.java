package lesson2;

import java.util.Scanner;

public class Task7 {
	private static Scanner scn;// класс принимающий номер дня недели, и
								// называющий это день

	public static void main(String[] args) {
		byte x;
		System.out.println("Введите номер:");
		scn = new Scanner(System.in);
		x = scn.nextByte();
		switch (x) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("пятница");
			break;
		case 6:
			System.out.println("Суббота");
			break;
		case 7:
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Дня недели под данным номером не существует");
		}
	}
}
