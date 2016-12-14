package factory;

public class RoadMotoMaker implements MotoMaker {
	public Moto createMoto() {
		return new RoadMoto();
	}

}
