package lesson15;
/**
 * class  product set
 * @author User
 *
 */
public class Products {
	
	private String name;//название продуктов
	Products(String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() { 
		return name;
	}
	
	
}
