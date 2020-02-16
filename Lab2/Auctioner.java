package Lab2;

public interface Auctioner {
	public void registerObserver(Bidders o);

	public void removeObserver(Bidders o);

	public void notifyObservers();
}