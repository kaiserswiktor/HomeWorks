package lesson3;

public class Task1 {
	static// класс выводящий значения массива и считающий его
			// среднеарифметическое число
	float[] mass1 = { 2, 55, 646, 64, 464, 234, 23, 233, 244, 7899 };
	static int i;

	public static void main(String[] args) {

		for (i = 0; i < mass1.length; i++) {
			System.out.println("Значение " + i + "=" + mass1[i]);
		}

		float sum = 0;
		for (int i = 0; i < mass1.length; i++) {
			sum = (sum + mass1[i]);
		}
		System.out.println("Среднеарифметическое сумма массива=" + sum / 10);
	}
}
