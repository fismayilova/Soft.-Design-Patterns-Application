package Lab5;

public class HappyClass {
	private static HappyClass uniqueInstance;

	/**
	 * In this class i used Synchronized keyword which makes the method
	 * accessible only for one thread
	 */
	private HappyClass() {
		System.out.println("This Class is Happy");
		// TODO Auto-generated constructor stub
	}

	public static synchronized HappyClass getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new HappyClass();
		}
		return uniqueInstance;
	}
}
