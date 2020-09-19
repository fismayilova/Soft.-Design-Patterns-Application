package Lab5;

public class Quarantine {
	private static Quarantine uniqueInstance;

	/**
	 * In this class we check whether the class does already have an instance.
	 * It ensures that only one instance is created
	 */

	private Quarantine() {
		System.out.println("This Class in on Quarantine");
		// TODO Auto-generated constructor stub
	}

	public static Quarantine getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Quarantine();
		}
		return uniqueInstance;
	}
}