package lesson4;

public class Task5 {// класс определяющий является ли одна строка перестановкой другой

	public static void main(String[] args) {
  String str="abcdef";
  String str1="fedcba";

 if (str.length() != str1.length()) {
	 System.out.println("Первая строка не является перестановкой другой");
	    }
 int[] letters = new int[256];
 
 char[] str_array = str.toCharArray();
 for (char c : str_array) {
     letters[c]++;
 }

 for (int i = 0; i < str1.length(); i++) {
     int c = (int) str1.charAt(i);
     if (--letters[c] < 0) {
    	System.out.println("Первая строка не является перестановкой другой");   
     }
 }
 System.out.println("Первая строка является перестановкой другой");
 
}  
	}
	


