/**
 * 
 */
package lesson5;

public class TaskBus {

	String imj;
	String famil;
	String marka;
	int nomer;
	int god;
	int probeg;

	public TaskBus(String imj, String famil, String marka, int nomer, int god,
			int probeg) {
		this.imj = imj;
		this.marka = marka;
		this.famil = famil;
		this.god = god;
		this.nomer = nomer;
		this.probeg = probeg;
	}

	public String getImj() {
		return imj;
	}

	public String getFamil() {
		return famil;
	}

	public String getMarka() {
		return marka;
	}

	public int getGod() {
		return god;
	}

	public int getNomer() {
		return nomer;
	}

	public int getProbeg() {
		return probeg;
	}

	public void setImj(String imj) {
		this.imj = imj;
	}

	public void setFamil(String famil) {
		this.famil = famil;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public void setGod(int god) {
		this.god = god;
	}

	public void setNomer(int nomer) {
		this.nomer = nomer;
	}

	public void setProbeg(int probeg) {
		this.probeg = probeg;
	}

	Bus b = new Bus();

	public void nomer() {
		Bus b = new Bus();

		if (b.x == 2) {
			if ((this.getNomer()) == b.y) {
				System.out.println(" Имя                      "+"\t" + getImj()+"\t");
				System.out.println(" Фамилия                  "+"\t" + getFamil()+"\t");
				System.out.println(" Марка автобуса           "+"\t" + getMarka()+"\t");
				System.out.println(" Номер автобуса           "+"\t" + getNomer()+"\t");
				System.out.println(" Год ввода в эксплуатацию "+"\t" + getGod()+"\t");
				System.out.println(" Пробег (км)              "+"\t" + getProbeg()+"\t");
				System.out.println();

			}
		}
	}

	public void god() {

		if (b.x == 3) {
			if ((this.getGod()) < b.y) {
				System.out.println(" Имя                      "+"\t" + getImj()+"\t");
				System.out.println(" Фамилия                  "+"\t" + getFamil()+"\t");
				System.out.println(" Марка автобуса           "+"\t" + getMarka()+"\t");
				System.out.println(" Номер автобуса           "+"\t" + getNomer()+"\t");
				System.out.println(" Год ввода в эксплуатацию "+"\t" + getGod()+"\t");
				System.out.println(" Пробег (км)              "+"\t" + getProbeg()+"\t");
				System.out.println();

			}
		}
	}

	public void probeg() {

		if (b.x == 4) {

			if ((this.getProbeg()) > b.y) {
				System.out.println(" Имя                      "+"\t" + getImj()+"\t");
				System.out.println(" Фамилия                  "+"\t" + getFamil()+"\t");
				System.out.println(" Марка автобуса           "+"\t" + getMarka()+"\t");
				System.out.println(" Номер автобуса           "+"\t" + getNomer()+"\t");
				System.out.println(" Год ввода в эксплуатацию "+"\t" + getGod()+"\t");
				System.out.println(" Пробег (км)              "+"\t" + getProbeg()+"\t");
				System.out.println();

			}
		}
	}

	public void show() {

		System.out.println(" Имя                      "+"\t" + getImj()+"\t");
		System.out.println(" Фамилия                  "+"\t" + getFamil()+"\t");
		System.out.println(" Марка автобуса           "+"\t" + getMarka()+"\t");
		System.out.println(" Номер автобуса           "+"\t" + getNomer()+"\t");
		System.out.println(" Год ввода в эксплуатацию "+"\t" + getGod()+"\t");
		System.out.println(" Пробег (км)              "+"\t" + getProbeg()+"\t");
		System.out.println();

	}
}
