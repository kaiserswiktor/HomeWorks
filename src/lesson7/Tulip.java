package lesson7;
/**
 * class s signaturoi Tulip
 * @author User
 *
 */
public class Tulip extends GardenFlowers {
	/**
	 * konsttruktor
	 * @param nazvanie
	 * @param color
	 * @param dlinnaSteblij
	 * @param potrebnostVodi
	 * @param swechest
	 * @param cena
	 * @param zapach
	 * @param button
	 */
	public Tulip(String nazvanie, String color, int dlinnaSteblij, int potrebnostVodi, int swechest, int cena,
			int zapach, int button) {
		
		this.dlinnaSteblij = dlinnaSteblij;
		this.potrebnostVodi = potrebnostVodi;
		this.swechest = swechest;
		this.cena = cena;
		this.nazvanie = nazvanie;
		this.color = color;
		this.zapach = zapach;
		this.button = button;
	}
/**
 * metod cvesti pokazivaet raskritie Tulip
 */
	@Override
	public int Cvesti(int potrebnostVodi) {
		return (potrebnostVodi);
	}

}
