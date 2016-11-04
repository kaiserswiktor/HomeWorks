package lesson3;

public class Task3 {// класс который находит наименьший элемент массива и его
					// индекс

	public static void main(String[] args) {
		int[] mass2 = { 13, 45, 67, 89, 890, 46, 454, 354, 46, 657, 686, 87, 8,
				87, 85 };
		int y = mass2[0];
		int u;
		for (u = 0; u < mass2.length; u++) {
			if (y > mass2[u]) {
				y = mass2[u];
				System.out.println("Минимальный элемент массива равен " + y
						+ " ,а индекс этого элемента равен " + u + "!");
			}
		}
	}
}