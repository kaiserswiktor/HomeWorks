package lesson4;

public class Task1 {// \класс который в английском тексте каждую букву заменяет ее порядковым номером в алфавите

	public static void main(String[] args) {
	String s1="a bargain is a bargain";
	String s2 = "";
    String s3 = "";
    for(char ch1 : s1.toCharArray()) {
        s2 += Character.isAlphabetic(ch1) ? String.format("%-3s",ch1 - 'a' + 1) : ch1;
        s3 += Character.isAlphabetic(ch1) ? String.format("%-3s",ch1) : ch1;
    }
    System.out.println(s3);
    System.out.println(s2);
    
	}
        }

