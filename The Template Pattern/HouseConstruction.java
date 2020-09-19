package Lab8;

public abstract class HouseConstruction {

	public void buildHouse() {
		buyMaterial();
		prepareMaterial();
		build();
		useMaterial();
	}

	abstract void build();

	abstract void useMaterial();

	public void prepareMaterial() {
		System.out.println("Material are being prepared");
	}

	public void buyMaterial() {
		System.out.println("Material were bought");
	}
}