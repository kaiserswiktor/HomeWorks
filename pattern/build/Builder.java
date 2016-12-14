package build;

public abstract class Builder {
	protected Dinner dinner = new Dinner();

	public Dinner getDinner() {
		return dinner;
	}

	public abstract void buildFirst();

	public abstract void buildSecond();

	public abstract void buildThird();

	public abstract void buildDessert();

	public abstract void buildSauce();

	public abstract void buildSideDish();
}
