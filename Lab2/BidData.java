package Lab2;

import java.util.ArrayList;

public class BidData implements Auctioner {
	private ArrayList<Bidders> bidders;
	private String slot_author;
	private int slot_price;
	String slot_name;

	public BidData() {
		bidders = new ArrayList<Bidders>();
	}

	public void registerObserver(Bidders o) {
		bidders.add(o);
	}

	public void removeObserver(Bidders o) {
		int i = bidders.indexOf(o);
		if (i >= 0) {
			bidders.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < bidders.size(); i++) {
			Bidders observer = (Bidders) bidders.get(i);
			observer.update(slot_author, slot_price, slot_name);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(int slot_price) {
		this.slot_price = slot_price;
		measurementsChanged();
	}

}
