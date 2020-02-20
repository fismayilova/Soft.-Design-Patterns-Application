package Lab2;

public class CurrentConditionsDisplay implements Bidders, Display {
	private int slot_price;
	String slot_name;
	public CurrentConditionsDisplay(Auctioner weatherData) {
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current conditions: " + slot_price);
	}

	@Override
	public void update(String slot_author, int slot_price, String slot_name) {
		this.slot_price = slot_price;
		this.slot_name = slot_name;
		display();
	}
}
