package Lab4;

public abstract class IceCreamStore {
	public IceCream ordericeCream(String type) {
		IceCream iceCream;
		iceCream = createIceCream(type);
		iceCream.pourIngredients();
		iceCream.blend();
		iceCream.freeze();
		iceCream.decorate();
		iceCream.addToppings();
		iceCream.addChocolate();
		return iceCream;
	}

	protected abstract IceCream createIceCream(String type);
	// other methods here
}
