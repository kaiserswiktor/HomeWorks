package factory;

public class SportMotoMaker implements MotoMaker {
	public Moto createMoto() {
		return new SportMoto();
	}

}
