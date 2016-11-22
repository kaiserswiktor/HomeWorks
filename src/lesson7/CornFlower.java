package lesson7;

/**
 * class s signaturoi CornFlower
 * 
 * @author User
 *
 */

public class CornFlower extends FieldsFlowers {
	int nektar;

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
	 * @param nektar
	 */
	public CornFlower(String nazvanie, String color, int dlinnaSteblij, int potrebnostVodi, int swechest, int cena,
			int lepestkow, int listiev, int nektar) {
		this.dlinnaSteblij = dlinnaSteblij;
		this.potrebnostVodi = potrebnostVodi;
		this.swechest = swechest;
		this.cena = cena;
		this.nazvanie = nazvanie;
		this.color = color;
		this.lepestkow = lepestkow;
		this.listiev = listiev;
		this.nektar = nektar;
	}

	public int getNektar() {
		return nektar;
	}

	public void setNektar(int nektar) {
		this.nektar = nektar;
	}

}
