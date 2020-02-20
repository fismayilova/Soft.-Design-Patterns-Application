package Lab4;

import java.util.ArrayList;

public abstract class IceCream {
	String name;
	String type;
	ArrayList<Object> toppings = new ArrayList<Object>();

	void pourIngredients() {
		System.out.println("Preparing " + name);
		System.out.println("Pour the milk...");
		System.out.println("vanilla and sugar to a blender...");
	}

	void blend() {
		System.out.println("Blend until smooth ");
	}

	void addChocolate() {
		System.out.println("Add chunky chocolate extras");
	}

	void freeze() {
		System.out.println("Freeze the mixture");
	}

	public String getName() {
		return name;
	}

	void decorate() {
		System.out.println("Decorate your ice-cream");
	}

	void addToppings() {
		System.out.print("Add toppings:");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}
}
