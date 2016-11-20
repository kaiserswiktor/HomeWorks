package lesson7;

public class CornFlower extends FieldsFlowers {
	int nektar;
	public CornFlower(String nazvanie,String color,int dlinnaSteblij,int potrebnostVodi,int swechest,int cena,int lepestkow,int listiev,int nektar){
		this.dlinnaSteblij=dlinnaSteblij;
		this.potrebnostVodi=potrebnostVodi;
		this.swechest=swechest;
		this.cena=cena;
		this.nazvanie=nazvanie;
		this.color=color;
		this.lepestkow=lepestkow;
		this.listiev=listiev;
		this.nektar=nektar;
	}
	
	public int getNektar() {
		return nektar;
	}
	public void setNektar(int nektar) {
		this.nektar = nektar;
	}
	

}
