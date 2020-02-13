package Lab3;

public class RomaTomatoes extends Decorator {
	Pizza pizza;

	public RomaTomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Roma Tomatoes";
	}

	public double cost() {
		return 3.8 + pizza.cost();
	}
}