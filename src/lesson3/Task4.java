package lesson3;

public class Task4 {// класс считающий количество отрицательных элементов
					// массива

	public static void main(String[] args) {
		int[] mass3 = { 13, 45, -67, 89, 890, 46, -454, 354, 46, -657 };
		int sum = 0;
		for (int i = 0; i < mass3.length; i++) {
			if (mass3[i] < 0)
				sum = sum + 1;
		}

		System.out.println("В данном масииве " + sum+ " отрицательных элемента");
	}

}
