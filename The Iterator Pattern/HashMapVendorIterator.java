package Lab9;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapVendorIterator implements Lab9.Iterator {
	HashMap<HotelItem, Integer> items;
	Iterator<?> hmIterator;
	int position = 0;

	public HashMapVendorIterator(HashMap<HotelItem, Integer> items) {
		this.items = items;
		hmIterator = items.entrySet().iterator();
	}

	public Object next() {
		return hmIterator.next();
	}

	public boolean hasNext() {
		return hmIterator.hasNext();
	}

	public void remove() {
		hmIterator.remove();
	}
}