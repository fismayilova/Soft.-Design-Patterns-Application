package Lab8;

public class Roof extends HouseConstruction {

	@Override
	void build() {
		System.out.println("The Roof is ready to be set on top of the house");
	}

	@Override
	void useMaterial() {
		System.out.println("We used tiles for Roof");
	}

}
