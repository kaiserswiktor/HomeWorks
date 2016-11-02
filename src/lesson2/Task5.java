package lesson2;

import java.util.Scanner;

public class Task5 {// класс который принимает рост и вес, и выдающий
					// рекомендации
	private static Scanner scn;

	public static void main(String args[]) {
		double x, y, z, e;
		System.out.println("Введите ваш рост(см):");
		scn = new Scanner(System.in);
		x = scn.nextDouble();
		System.out.println("Введите вас вес(кг):");
		y = scn.nextDouble();
		{
			z = x - 100 - y;
			e = (x - 100 - y) * -1;
		}
		if (x - y == 100)
			System.out.println("Ваш вес идеальный");
		if (x - y > 100)
			System.out.println("Вам следует поправиться на " + z + "кг");
		else
			System.out.println("Вам следует похудеть на  " + e + "кг");
	}

}
