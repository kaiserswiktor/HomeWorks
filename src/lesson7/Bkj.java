package lesson7;


	
	import java.util.Enumeration;
	import java.util.Locale;
	import java.util.ResourceBundle;
	import java.io.*;
	import java.util.*;

	/**
	 * class vhoda v prilochenie
	 * 
	 * @author User
	 * 
	 */
	public class Bkj {
		
	
		private static Scanner scanner;// variable class Scanner

		private static final String FILENAME = "MessageBundle";
		

		public static void main(String args[]) throws MyException, Exception {
			int scannerForMain;// variable
		
			Locale locale1 =new Locale("ru","RU") ;
			Locale locale2 = new Locale("en","EN");
		    Locale current = (locale2);
		
		    ResourceBundle rb = ResourceBundle.getBundle("resource.MessageBundle", current);
			
			
		
			System.out.println(rb.getString("s1"));
			System.out.println(rb.getString("s2"));
			System.out.println(rb.getString("s3"));
			System.out.println(rb.getString("s4"));
			System.out.println(rb.getString("s5"));
			System.out.println(rb.getString("s6"));
			System.out.println(rb.getString("s7"));
			scanner = new Scanner(System.in);
			
	      while(true){
	    	  scannerForMain = scanner.nextInt();
			try {
				
				if (scannerForMain == 1) {
					
				
					
				} else if (scannerForMain == 2) {
					
					
					

				} else if (scannerForMain == 3) {
					
					
				} else if (scannerForMain == 4) {
					
					
					}
				else if (scannerForMain == 5) {
					
					
				} else if (scannerForMain == 6) {

					
					

				} else if (scannerForMain == 7) {
					 return;
				}

			
					throw new MyException(scannerForMain);
				}
			
			 catch (MyException l) {
				
			}}
		}
}
