package Lab9;

public class HotelItem {
	String name;
	String vendor;
	double price;

	public HotelItem(String name, String vendor, double price) {
		this.name = name;
		this.vendor = vendor;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getVendor() {
		return vendor;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "\nname: " + name + "\nvendor: " + vendor + "\nprice: " + price + " ";
	}
}