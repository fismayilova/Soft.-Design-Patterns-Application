package Lab8;

public abstract class HouseConstructionWithHook {

	void buildHouse() {
		buyMaterial();
		prepareMaterial();
		build();
		if (customerWantsExtraMaterial()) {
			useMaterial();
		}
	}

	abstract void build();

	abstract void useMaterial();

	public void prepareMaterial() {
		System.out.println("Material are being prepared");
	}

	public void buyMaterial() {
		System.out.println("Material were bought");
	}

	boolean customerWantsExtraMaterial() {
		return true;
	}
}