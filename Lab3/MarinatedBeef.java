package Lab3;

public class MarinatedBeef extends Decorator {
	Pizza pizza;

	public MarinatedBeef(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Marinated Beef";
	}

	public double cost() {
		return 4.73 + pizza.cost();
	}
}