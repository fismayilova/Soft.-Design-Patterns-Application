package Lab5;

public class BowlOfCandies {
	private volatile static BowlOfCandies uniqueInstance;

	/**
	 * In this Class we use double-check locking. We check whether we havean
	 * instance and if not we enter a synchronized block. Is also used for
	 * dealing with multithreading
	 */

	private BowlOfCandies() {
		System.out.println("This is a bowl of candies");
		// TODO Auto-generated constructor stub
	}

	public static BowlOfCandies getInstance() {
		if (uniqueInstance == null) {
			synchronized (BowlOfCandies.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new BowlOfCandies();
				}
			}
		}
		return uniqueInstance;
	}
}