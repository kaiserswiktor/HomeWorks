package lesson2;

import java.util.*;

public class Task8 {// класс считающий сумму первых x членов ряда: 1 + 1/2.....
					// + x раз
	private static Scanner scn;

	public static void main(String args[]) {
		double x, y;
		y = 1;
		System.out.println("Введите число ");
		scn = new Scanner(System.in);
		x = scn.nextDouble();
		double sum = 0;
		{
			for (double i = 1; i <= x; i++)
				sum += y / i;
			System.out.println(sum);
		}
	}
}