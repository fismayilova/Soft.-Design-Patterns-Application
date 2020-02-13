package Lab2;

public class CurrentConditionsDisplay implements Bidders, Display {
	private int slot_price;
	private Auctioner bidData;

	public CurrentConditionsDisplay(Auctioner bidData) {
		this.bidData = bidData;
		bidData.registerObserver(this);
	}

	public void update(String slot_author, int slot_price, String slot_name) {
	}

	public void display() {
		System.out.println("Current conditions: " + slot_price);
	}

}
