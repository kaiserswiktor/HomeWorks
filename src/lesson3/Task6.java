package lesson3;

public class Task6 {//В массиве из 10 чисел переставить все нули в конец массива, не меняя порядок ненулевых элементов.
	public static void main(String[] args) {
		 
		int[] mass5 = { 13, 450, 670, 89, 0, 46, 454, 0, 46, 657 };{
		for(int i=mass5.length-1; i>0;i--){      	
				for( int j=0;j<i;j++){
					if(mass5[j]==0){
	    if(mass5[j]<mass5[ 1+j]){	
		int y= mass5[j];
		mass5[j]=mass5[1+j];
		mass5[1+j]=y;
			}}	}}}
		for(int  i=0;i<mass5.length;i++){
		System.out.println(mass5[i]);
}}}