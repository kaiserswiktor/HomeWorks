package lesson15;

import java.util.concurrent.*;
/**
 * class shop 
 * @author User
 *
 */
public class Task1 {
	public static void main(String args[]) {//две кассы
         System.out.println("Магазин открылся");
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(new BuyerThread("Buyer1"));
		es.execute(new BuyerThread("Buyer2"));
		es.execute(new BuyerThread("Buyer3"));
		es.execute(new BuyerThread("Buyer4"));
		es.execute(new BuyerThread("Buyer5"));
		es.execute(new BuyerThread("Buyer6"));
		es.execute(new BuyerThread("Buyer7"));
		
		
	}

}