package Lab2;

public class CurrentConditionsDisplay implements Bidders, Display {
	private String slot_author;
	private int slot_price;
	String slot_name;
	private Auctioner weatherData;

	public CurrentConditionsDisplay(Auctioner weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current conditions: " + slot_price);
	}

	@Override
	public void update(String slot_author, int slot_price, String slot_name) {
		this.slot_author = slot_author;
		this.slot_price = slot_price;
		this.slot_name = slot_name;
		display();
	}
}
