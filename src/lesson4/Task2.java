package lesson4;

public class Task2 {//класс удаляющий все символы, кроме пробелов, не являющиеся буквами
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer(
				"There are many big , small libraries everywhere in our country. They have millions of books in different languages!");
			System.out.println("Начальный текст:" + s1);
			if (!Character.isLetter(s1.charAt(0))) {
				s1.deleteCharAt(0);
			}
			for (int i = 0; i < s1.length(); i++) {
				if (!Character.isLetter(s1.charAt(i))
						&& !Character.isWhitespace(s1.charAt(i))) {
					s1.setCharAt(i, ' ');
				}
			}
			System.out.println("Конечгый текст:" + s1);
		}

	}

