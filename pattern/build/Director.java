package build;

public class Director {

	public static Dinner createDinner(Builder builder) {

		builder.buildFirst();
		builder.buildSecond();
		builder.buildThird();
		builder.buildDessert();
		builder.buildSauce();
		builder.buildSideDish();
		return builder.getDinner();
	}
}
