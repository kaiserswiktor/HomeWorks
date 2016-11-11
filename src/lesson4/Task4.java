package lesson4;

public class Task4 {//класс с алгоритмом, определяющим, все ли символы в строке встречаются один раз.
public static  boolean main(String args[]){
	boolean[] char_set=new boolean[256];
	String s1 = "";
   char[] ch1=s1.toCharArray() ;
 for (int i=0;i<s1.length();i++){
  	     int x=s1.charAt(i);
  	     if(char_set[x]){
  	    	 return false;
  	     }
	 char_set[x]=true;
 }
 return true;

}


}