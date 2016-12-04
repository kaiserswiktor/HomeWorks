package lesson15;

import java.util.concurrent.CopyOnWriteArrayList;
/**
 * class creating Buyers
 * @author User
 *
 */
public   class BuyerThread implements Runnable {
	
	String name;// имя покупателя
	BuyerThread(String name){
	this.name=name;	
	}
	@Override
	public void run() {
		System.out.println(name+" подошел к кассе");
		buy();
		System.out.println("Кассир пробил продукты");
		System.out.println(name+"ушел из кассы");
	}
	/**
	 *  method creating a basket of products
	 */
	public synchronized  void buy(){
		Products product1 = new Products("Milk");
		Products product2 = new Products("Bread");
		Products product3 = new Products("Sugar");
		CopyOnWriteArrayList<Products> productsList = new CopyOnWriteArrayList<Products>();
		productsList.add(product1);
		productsList.add(product2);
		productsList.add(product3);
		System.out.println(name+"-Выложил продукты:"+productsList+" из корзины");

	}
	
	

}
