package lesson7;

/**
 * naslednik Flowers i dobavljet svoi polj i metodi
 * 
 * @author User
 *
 */
public class FieldsFlowers extends Flowers {
	int lepestkow;
	int listiev;

	/**
	 * metod ukazivaet chto FieldsFlowers sobirat
	 */
	public void sobirat() {
		return;

	}

	public int getLepestkow() {
		return lepestkow;
	}

	public int getListiev() {
		return listiev;
	}

	public void setLepestkow(int lepestkow) {
		this.lepestkow = lepestkow;
	}

	public void setListiev(int listiev) {
		this.listiev = listiev;
	}
}