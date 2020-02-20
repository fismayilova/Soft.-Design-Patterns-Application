package Lab4;

public class MyIceCreamStore extends IceCreamStore {

	@Override
	protected IceCream createIceCream(String type) {
		if (type.equals("Rocky Road")) {
			return new RockyRoadIceCream();
		} else if (type.equals("Peanut")) {
			return new PeanutCreamIceCream();
		} else if (type.equals("Cookie")) {
			return new CookieDoughIceCream();
		} else if (type.equals("Cherry")) {
			return new CherryBlossomIceCream();
		} else
			return null;
	}
}
