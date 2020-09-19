package Lab8;

import java.util.Random;

public class Walls extends HouseConstruction {
	Random rand = new Random();
	String brick = "brick";
	String stone = "stone";
	String wood = "wood";

	@Override
	void build() {
		System.out.println("The Walls are being built");
	}

	@Override
	void useMaterial() {
		int n = rand.nextInt(3);
		if (n == 1) {
			System.out.println("We used " + brick + " for Walls");
		} else if (n == 2) {
			System.out.println("We used " + stone + " for Walls");
		} else if (n == 3) {
			System.out.println("We used " + wood + " for Walls");
		}
	}

}