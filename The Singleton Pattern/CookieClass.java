package Lab5;

public class CookieClass {
	private static CookieClass uniqueInstance = new CookieClass();

	/**
	 * Synchronizing a method can decrease performance by a factor of 100. So to
	 * avoid multithreading and to not use Synchronized keyword we initialize
	 * the instance beforehand and then call getInstance method and return the
	 * instance that we have.
	 * 
	 */

	private CookieClass() {
		System.out.println("This is a Cookie");
	}

	public static CookieClass getInstance() {
		return uniqueInstance;
	}
}