package Lab9;

import java.util.ArrayList;
import java.util.List;

public class ListVendor {
	List<HotelItem> menuItems = new ArrayList<HotelItem>();

	public ListVendor() {
		addItem("K&B's Hotel", "List", 2.99);
		addItem("Regular Hotel", "List", 2.99);
		addItem("Cute Hotel", "List", 3.49);
		addItem("Hotel and Waffles", "List", 3.59);
	}

	public void addItem(String name, String description, double price) {
		HotelItem menuItem = new HotelItem(name, description, price);
		menuItems.add(menuItem);
	}

	public List<HotelItem> getMenuItems() {
		return menuItems;
	}

	public Lab9.Iterator createIterator() {
		return new ListVendorIterator(menuItems);
	}

}
