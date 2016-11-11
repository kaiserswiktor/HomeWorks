package lesson4;

public class Task3 {//класс который удаляет все слова длинной 5 символов, начинающиеся на согласную букву.

	public static void main(String[] args) {
		String s1 = "There are many big , small libraries everywhere in our country. They have millions of books in different languages!";

		String[] strArr = s1.split(" ");
		StringBuilder s2 = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			char first = strArr[i].charAt(0);
			if (!((strArr[i].length() % 5 == 0) && ((first != 'a')
					&& (first != 'e') && (first != 'i') && (first != 'o')
					&& (first != 'u') && (first != 'y')))) {

				s2.append(strArr[i]).append(" ");
			}
		}
		String s3 = s2.toString();

		System.out.print("отформатированный текс"+s3 + " ");

	}
}
