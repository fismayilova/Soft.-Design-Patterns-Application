package Lab4;

public class PizzaTestDrive {

	public static void main(String[] args) {
		IceCreamStore myStore = new MyIceCreamStore();
		IceCream iceCream = myStore.ordericeCream("Cookie");
		System.out.println("Ethan ordered a " + iceCream.getName() + "\n");
		iceCream = myStore.ordericeCream("Cherry");
		System.out.println("Some Guy ordered a " + iceCream.getName() + "\n");
		iceCream = myStore.ordericeCream("Rocky Road");
		System.out.println("Girl next to the guy ordered a " + iceCream.getName() + "\n");
		iceCream = myStore.ordericeCream("Peanut");
		System.out.println("Girl next to her ordered a " + iceCream.getName() + "\n");
	}
}
