package Lab9;

import java.util.ArrayList;
import java.util.TreeMap;

public class TreeVendor {
	HotelItem hotelItem;
	static final int MAX_ITEMS = 6;
	Integer numberOfItems = 0;
	ArrayList<HotelItem> alist;
	TreeMap<HotelItem, Integer> hotelItems = new TreeMap<HotelItem, Integer>();

	public TreeVendor() {
	}

	public void addItem(String name, String description, double price) {
		HotelItem menuItem = new HotelItem(name, description, price);
		System.out.println(menuItem);
	}

	public TreeMap<HotelItem, Integer> gethotelItems() {
		return hotelItems;
	}

	public Lab9.Iterator createIterator() {
		addItem("K&B's Hotel", "TreeMap", 2.99);
		addItem("Regular Hotel", "TreeMap", 2.99);
		addItem("Cute Hotel", "TreeMap", 3.49);
		addItem("Hotel This class is not working", "TreeMap", 3.59);
		return new TreeVendorIterator(gethotelItems());

	}
}