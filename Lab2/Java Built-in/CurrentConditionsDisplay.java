package JavaObserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display {
	Observable observable;
	private int price;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof BidData) {
			BidData bidData = (BidData) obs;
			this.price = bidData.getSlot_price();
			display();
		}
	}

	public void display() {
		System.out.println("Current conditions: " + price);
	}
}