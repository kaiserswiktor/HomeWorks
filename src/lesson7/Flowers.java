package lesson7;

import java.io.Serializable;

/**
 * class Flowers jvljetsj roditelskim i soderchit polj i metodi
 * 
 * @author User
 *
 */

public class Flowers implements Serializable {
	static final long serialVersionUID = 1L;
	int dlinnaSteblij;
	int potrebnostVodi;
	int swechest;
	int price;
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
	public int blossom(int potrebnostVodi) {
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

	public int getPrice() {
		return price;
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

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * pereopredelenie toString
	 */
	@Override
	public String toString() {
		return "Name-" + nazvanie + " Color-" + color+"Long"+dlinnaSteblij;
	}

}
