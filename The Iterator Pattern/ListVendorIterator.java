package Lab9;

import java.util.List;
import java.util.Iterator;

public class ListVendorIterator implements Lab9.Iterator {
	ListVendor itListVendor;
	List<HotelItem> items;
	Iterator<?> listIterator;

	public ListVendorIterator(List<HotelItem> menuItems) {
		this.items = menuItems;
		listIterator = items.iterator();
	}

	public Object next() {
		return listIterator.next();
	}

	public boolean hasNext() {
		return listIterator.hasNext();
	}

	@Override
	public void remove() {
		listIterator.remove();
	}

}