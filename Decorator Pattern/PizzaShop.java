package Lab3;

public class PizzaShop {

	public static void main(String args[]) {
		Pizza pizza = new Neapolitan();
		pizza = new MarinatedBeef(pizza);
		System.out.println(pizza.getDescription() + " $" + pizza.cost());
		Pizza pizza2 = new BagelPizza();
		pizza2 = new WhiteGoatCheese(pizza2);
		System.out.println(pizza2.getDescription() + " $" + pizza2.cost());
		Pizza pizza3 = new MaltesePizza();
		pizza3 = new RomaTomatoes(pizza3);
		pizza3 = new WhiteGoatCheese(pizza3);
		System.out.println(pizza3.getDescription() + " $" + pizza3.cost());
	}
}