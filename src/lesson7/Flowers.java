package lesson7;
public  class Flowers   {


int dlinnaSteblij;
int potrebnostVodi;
int swechest;
int cena;
String nazvanie;
String color;
public int rasti (int dlinnaSteblij){
return( dlinnaSteblij);
}
public int Cvesti (int potrebnostVodi){
return( potrebnostVodi);
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
@Override
public String toString() {
return "1"+nazvanie+"2"+color;
}


}


