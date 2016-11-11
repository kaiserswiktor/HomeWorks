import java.util.Scanner;
public class Task13 {
public static void main(String args[]){
	Scanner scn=new Scanner(System.in);
	System.out.println("Введите действие,если деление введите 1, если сложение введите 2, если вычетание 3,умножение 4:");
	  Double x=scn.nextDouble();
	if(x==1){
	System.out.println("Введите первое число:");
	double y=scn.nextDouble();
	System.out.println("Введите второе число:");
	double y1=scn.nextDouble();
	if(y1==0){
		System.out.println("На ноль делить нельзя:");}
	System.out.println("Деление первого числа на второе = "+(y/y1));
	}
	else if(x==2){
		System.out.println("Введите первое число:");
		double y=scn.nextDouble();
		System.out.println("Введите второе число:");
		double y1=scn.nextDouble();

		System.out.println("Сложение первого числа на второе = "+(y+y1));}
	else if(x==3){
		System.out.println("Введите первое число:");
		double y=scn.nextDouble();
		System.out.println("Введите второе число:");
		double y1=scn.nextDouble();	
		System.out.println("Вычетание первого числа на второе = "+(y-y1));}
	else if(x==4){
		System.out.println("Введите первое число:");
		double y=scn.nextDouble();
		System.out.println("Введите второе число:");
		double y1=scn.nextDouble();
		
		System.out.println("Умножение первого числа на второе = "+y*y1);}
	}
}

