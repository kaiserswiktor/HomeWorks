package lesson7;

/**
 * class s signaturoi Rose
 * 
 * @author User
 *
 */
public class Rose extends GardenFlowers {

	private static final long serialVersionUID = 1L;
	int koluchki;

	/**
	 * Konstruktor
	 * 
	 * @param nazvanie
	 * @param color
	 * @param dlinnaSteblij
	 * @param potrebnostVodi
	 * @param swechest
	 * @param cena
	 * @param zapach
	 * @param button
	 * @param koluchki
	 */

	public Rose(String nazvanie, String color, int dlinnaSteblij, int potrebnostVodi, int swechest, int price,
			int zapach, int button, int koluchki) {
		this.nazvanie = nazvanie;
		this.color = color;
		this.dlinnaSteblij = dlinnaSteblij;
		this.potrebnostVodi = potrebnostVodi;
		this.swechest = swechest;
		this.price = price;
		this.zapach = zapach;
		this.button = button;
		this.koluchki = koluchki;
	}

	public int getKoluchki() {
		return koluchki;
	}

	public void setKoluchki(int koluchki) {
		this.koluchki = koluchki;
	}
}
