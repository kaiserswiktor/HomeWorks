package lesson3;

public class Task2 {// класс который находит наименьший и наибольший элемент
					// массива

	public static void main(String[] args) {
		int[] mass1 = { 55, 2, 66, 64, 44, 24, 23, 23, 24, 8 };
		int x = mass1[0];
		int i;
		for (i = 0; i < 9; i++) {
			if (x < mass1[i])
				x = mass1[i];
		}
		System.out.println(x);

		int y = mass1[0];
		for (int u = 0; u < mass1.length; u++) {
			if (mass1[u] < y)
				y = mass1[u];
		}
		System.out.println(y);

	}
}
