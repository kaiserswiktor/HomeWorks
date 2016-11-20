package lesson7;
public class Tulip extends GardenFlowers {
public Tulip(String nazvanie,String color,int dlinnaSteblij,int potrebnostVodi,int swechest,int cena,int zapach,int button){
	this.dlinnaSteblij=dlinnaSteblij;
	this.potrebnostVodi=potrebnostVodi;
	this.swechest=swechest;
	this.cena=cena;
	this.nazvanie=nazvanie;
	this.color=color;
	this.zapach=zapach;
	this.button=button;
}	
	@Override
	public int Cvesti (int potrebnostVodi){
		return( potrebnostVodi);
		}
	
	
}
