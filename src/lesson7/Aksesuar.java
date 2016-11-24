package lesson7;

public class Aksesuar {
	String name;
	int cenaaks;

	public Aksesuar(String name, int cenaaks) {
		this.cenaaks = cenaaks;
		this.name = name;
	}
	public int getCenaaks() {
		return cenaaks;
	}
	public String getName() {
		return name;
	}
	public void setCenaaks(int cenaaks){
		this.cenaaks = cenaaks;
	}
	public void setName(String name){
		this.name = name;
	}
}
