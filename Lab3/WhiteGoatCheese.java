package Lab3;

public class WhiteGoatCheese extends Decorator {
	Pizza pizza;

	public WhiteGoatCheese(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", White Goat Cheese";
	}

	public double cost() {
		return 8.99 + pizza.cost();
	}
}