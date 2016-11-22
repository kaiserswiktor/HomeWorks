package lesson7;

/**
 * class Flowers jvljetsj roditelskim i soderchit polj i metodi
 * 
 * @author User
 *
 */

public class Flowers {

	int dlinnaSteblij;
	int potrebnostVodi;
	int swechest;
	int cena;
	String nazvanie;
	String color;

	/**
	 * metod uvelichenij dlinnaSteblij
	 * 
	 * @param dlinnaSteblij
	 * @return
	 */
	public int rasti(int dlinnaSteblij) {
		return (dlinnaSteblij);
	}

	/**
	 * metod pokazivaet sostojnie cvetka v zavisimosti ot Vodi
	 * 
	 * @param potrebnostVodi
	 * @return
	 */
	public int Cvesti(int potrebnostVodi) {
		return (potrebnostVodi);
	}

	public String getNazvanie() {
		return nazvanie;
	}

	public String getColor() {
		return color;
	}

	public int getDlinnaSteblij() {
		return dlinnaSteblij;
	}

	public int getPotrebnostVodi() {
		return potrebnostVodi;
	}

	public int getSwechest() {
		return swechest;
	}

	public int getCena() {
		return cena;
	}

	public void setNazvanie(String nazvanie) {
		this.nazvanie = nazvanie;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDlinnaSteblij(int dlinnaSteblij) {
		this.dlinnaSteblij = dlinnaSteblij;
	}

	public void setPotrebnostVodi(int potrebnostVodi) {
		this.potrebnostVodi = potrebnostVodi;
	}

	public void setSwechest(int swechest) {
		this.swechest = swechest;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	/**
	 * pereopredelenie toString
	 */
	@Override
	public String toString() {
		return "Name-" + nazvanie + " Color-" + color;
	}

}
