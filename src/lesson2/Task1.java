package lesson2;

public class Task1 {// класс выводящий количество символов в строке и делящий
					// строку пополам
	public static void main(String args[]) {
		String s = "Blackberry";
		System.out.println(s.length());
		String a = s.substring(0, s.length() / 2);
		String c = s.substring(s.length() - s.length() / 2);
		System.out.println(a + "-" + c);
	}
}
