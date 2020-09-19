package Lab9;

import java.util.HashMap;

public class HashMapVendor {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	HashMap<HotelItem, Integer> hotelItems = new HashMap<HotelItem, Integer>();

	public HashMapVendor() {
		addItem("LaLaLa", "HashMap", 2.99);
		addItem("IDK", "HashMap", 2.99);
		addItem("Nothing Works", "HashMap", 3.29);
	}

	public void addItem(String name, String description, double price) {
		HotelItem hotelItem = new HotelItem(name, description, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			hotelItems.put(hotelItem, numberOfItems);
			numberOfItems += 1;
		}
	}

	public HashMap<HotelItem, Integer> gethotelItems() {
		return hotelItems;
	}

	public Lab9.Iterator createIterator() {
		return new HashMapVendorIterator(hotelItems);
	}
}