package lesson2;
import java.util.Scanner;
public class Task11 {
	
private static Scanner scn;

public static void main(String args[]){
	int y = 0;
scn = new Scanner(System.in);
System.out.println("Введите n число:");
int x=scn.nextInt();
for(int i=1;i<=x;i++){
	 y+=i;
}
System.out.println(y);

}
}