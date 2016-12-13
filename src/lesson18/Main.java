package lesson18;

public class Main {

	public static void main(String[] args) {
	Dinner d=Director.createDinner(new ComplexDinner());
	Dinner d1=Director.createDinner(new FullComplexDinner());
System.out.println(d);
System.out.println(d1);
	}

}
