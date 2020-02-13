package Lab2;

import java.util.ArrayList;

public class BidData implements Auctioner {
	private ArrayList<Bidders> bidders;
	private String slot_author;
	int slot_price;
	String slot_name;

	public void setMeasurements(int slot_price) {
		this.slot_price = slot_price;
		measurementsChanged();
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	@Override
	public void registerObserver(Bidders o) {
		bidders.add(o);
	}

	@Override
	public void removeObserver(Bidders o) {
		int i = bidders.indexOf(o);
		if (i >= 0) {
			bidders.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < bidders.size(); i++) {
			Bidders observer = (Bidders) bidders.get(i);
			observer.update(slot_author, slot_price, slot_name);
		}
	}

	public String getSlot_author() {
		return slot_author;
	}

	public int getSlot_price() {
		return slot_price;
	}

	public int getSlot_name() {
		return slot_price;
	}
}
