package factory;

public class Main {
public static void main(String args[]){
	MotoMaker maker=new RoadMotoMaker();
	Moto moto=maker.createMoto();
	moto.drive();
}
}
