package lesson3;

public class Task5 {// класс который в массиве из 10 чисел вычисляет произведение элементов
					// массива до первого нуля.

	public static void main(String[] args) {
		int[] mass4 = { 13, 450, -670, 89, 0, 46, -454, 3540, 46, -657 };
		int sum = 0;
		for (int i = 0; i < mass4.length; i++) {
			if (mass4[i] <= 0) {
				break;
			}

			sum += mass4[i];
		}
		System.out.println(sum);
	}

	}


