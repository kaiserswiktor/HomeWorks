package lesson2;

public class Task12 {//класс который выводит на экран значения функции у = 2х^2-5х-8 в диапазоне от -4 до 4
public static void main (String args[]){
double x;
double y;
for(x=-4;x<4;x+=0.5){
	if(x==0)
		break;
	y=2*(x*x)-5*x-8;
	

System.out.println(y);
}
}}