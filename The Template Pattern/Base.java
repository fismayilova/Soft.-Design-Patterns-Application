package Lab8;

public class Base extends HouseConstruction {

	@Override
	void build() {
		System.out.println("Land was bought");
		System.out.println("The Base is being built");
		System.out.println("Bulldozers are working on the land");
	}

	@Override
	void useMaterial() {
		System.out.println("We used concrete for the Base");

	}

}
