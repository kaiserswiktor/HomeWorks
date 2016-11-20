package lesson7;

public class Rose extends GardenFlowers{
int koluchki;
public Rose(String nazvanie,String color,int dlinnaSteblij,int potrebnostVodi,int swechest,int cena,int zapach,int button,int koluchki ){
	this.nazvanie=nazvanie;
	this.color=color;
	this.dlinnaSteblij=dlinnaSteblij;
	this.potrebnostVodi=potrebnostVodi;
	this.swechest=swechest;
	this.cena=cena;
	this.zapach=zapach;
	this.button=button;
	this.koluchki=koluchki;
}
public int getKoluchk() {
	return koluchki;
}
public void setKoluchki(int koluchk) {
	this.koluchki = koluchk;
}
}
