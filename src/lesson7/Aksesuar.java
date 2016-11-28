package lesson7;

/**
 * class keep fields and methods Aksesuar
 * 
 * @author User
 *
 */
public class Aksesuar {
	String name;// name accessories
	int price;// price accessories

	/**
	 * constructor  accessories
	 * 
	 * @param name
	 * @param price
	 */
	public Aksesuar(String name, int price) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
}
