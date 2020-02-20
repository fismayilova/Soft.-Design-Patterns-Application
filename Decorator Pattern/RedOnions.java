package Lab3;

public class RedOnions extends Decorator {
	Pizza pizza;

	public RedOnions(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Red Onions";
	}

	public double cost() {
		return 1.20 + pizza.cost();
	}
}