package lesson18;

public class Dinner {
private  String first;
private  String second;
private  String third;
private  String dessert;
private  String sauce;
private String sideDish;

public String getFirst() {
	return first;
}
public void setFirst(String first) {
	this.first = first;
}
public String getSecond() {
	return second;
}
public void setSecond(String second) {
	this.second = second;
}
public String getThird() {
	return third;
}
public void setThird(String third) {
	this.third = third;
}
public String getDessert() {
	return dessert;
}
public void setDessert(String dessert) {
	this.dessert = dessert;
}
public String getSauce() {
	return sauce;
}
public void setSauce(String sauce) {
	this.sauce = sauce;
}
public String getSideDish() {
	return sideDish;
}
public void setSideDish(String sideDish) {
	this.sideDish = sideDish;
}
@Override
public String toString(){
	return"Dinner: First-"+first+";Second-"+second+";Third-"+third+";Dessert-"+dessert+";Sauce-"+sauce+";SideDish-"+sideDish;
}

}
