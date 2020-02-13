package JavaObserver;

import Lab2.Bidders;

public interface Observable {
	public void registerObserver(Bidders o);

	public void removeObserver(Bidders o);

	public void notifyObservers();
}
