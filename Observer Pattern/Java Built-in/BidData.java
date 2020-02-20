package JavaObserver;

import java.util.Observable;

public class BidData extends Observable {
	private String slot_author;
	private int slot_price;
	private String slot_name;

	public BidData() {
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(int slot_price) {
		this.slot_price = slot_price;
		measurementsChanged();
	}

	public String getSlot_author() {
		return slot_author;
	}

	public int getSlot_price() {
		return slot_price;
	}

	public String getSlot_name() {
		return slot_name;
	}
}