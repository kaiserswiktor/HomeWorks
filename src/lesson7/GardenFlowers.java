package lesson7;

/**
 * class naslednik Flowers i dobavljet svoi polj i metodi
 * 
 * @author User
 *
 */
public class GardenFlowers extends Flowers {

	private static final long serialVersionUID = 1L;
	int zapach;
	int button;

	/**
	 * metod ukazivaet chto GardenFlowers wirastivaut
	 */
	public void grow() {
		return;
	}

	public int getZapach() {
		return zapach;
	}

	public int getButton() {
		return button;
	}

	public void setZapach(int zapach) {
		this.zapach = zapach;
	}

	public void setButton(int button) {
		this.button = button;
	}

	public int blossom(int potrebnostVodi) {
		return 0;
	}
}