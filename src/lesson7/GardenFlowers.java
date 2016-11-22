package lesson7;

/**
 * class naslednik Flowers i dobavljet svoi polj i metodi
 * 
 * @author User
 *
 */
public class GardenFlowers extends Flowers {
	int zapach;
	int button;

	/**
	 * metod ukazivaet chto GardenFlowers wirastivaut
	 */
	public void wirastivaut() {
		return;
	}

	public int getzapach() {
		return zapach;
	}

	public int getbutton() {
		return button;
	}

	public void setZapach(int zapach) {
		this.zapach = zapach;
	}

	public void setButton(int button) {
		this.button = button;
	}
}