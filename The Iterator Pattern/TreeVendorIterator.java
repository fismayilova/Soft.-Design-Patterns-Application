package Lab9;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeVendorIterator implements Lab9.Iterator {
	TreeMap<HotelItem, Integer> treeMap;
	Iterator<?> stackIt;

	public TreeVendorIterator(TreeMap<HotelItem, Integer> treeMap) {
		this.treeMap = treeMap;
		stackIt = treeMap.entrySet().iterator();
	}

	@Override
	public boolean hasNext() {
		return stackIt.hasNext();
	}

	@Override
	public Object next() {
		return stackIt.next();

	}

	@Override
	public void remove() {
		stackIt.remove();
	}

}
