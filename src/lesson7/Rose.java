package lesson7;

/**
 * class s signaturoi Rose
 * 
 * @author User
 *
 */
public class Rose extends GardenFlowers {
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

	public Rose(String nazvanie, String color, int dlinnaSteblij, int potrebnostVodi, int swechest, int cena,
			int zapach, int button, int koluchki) {
		this.nazvanie = nazvanie;
		this.color = color;
		this.dlinnaSteblij = dlinnaSteblij;
		this.potrebnostVodi = potrebnostVodi;
		this.swechest = swechest;
		this.cena = cena;
		this.zapach = zapach;
		this.button = button;
		this.koluchki = koluchki;
	}

	public int getKoluchk() {
		return koluchki;
	}

	public void setKoluchki(int koluchk) {
		this.koluchki = koluchk;
	}
}
