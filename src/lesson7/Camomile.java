package lesson7;

/**
 * class s signaturoi Camomile
 * 
 * @author User
 *
 */
public class Camomile extends FieldsFlowers {
	int lekarstvo;

	/**
	 * konstruktor
	 * 
	 * @param nazvanie
	 * @param color
	 * @param dlinnaSteblij
	 * @param potrebnostVodi
	 * @param swechest
	 * @param cena
	 * @param lepestkow
	 * @param listiev
	 * @param lekarstvo
	 */
	public Camomile(String nazvanie, String color, int dlinnaSteblij, int potrebnostVodi, int swechest, int cena,
			int lepestkow, int listiev, int lekarstvo) {
		this.dlinnaSteblij = dlinnaSteblij;
		this.potrebnostVodi = potrebnostVodi;
		this.swechest = swechest;
		this.cena = cena;
		this.nazvanie = nazvanie;
		this.color = color;
		this.lepestkow = lepestkow;
		this.listiev = listiev;
		this.lekarstvo = lekarstvo;
	}

	public int getLekarstvo() {
		return lekarstvo;
	}

	public void setLekarstvo(int lekarstvo) {
		this.lekarstvo = lekarstvo;
	}
}
