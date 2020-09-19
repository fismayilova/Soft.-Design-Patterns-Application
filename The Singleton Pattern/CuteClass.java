package Lab5;

public class CuteClass {

	/**
	 * This class is a simple Singleton. Many instances of this class can be created 
	 */
	private CuteClass() {
		System.out.println("This Class is Cute");
		// TODO Auto-generated constructor stub
	}

	public static CuteClass getInstance() {
		return new CuteClass();
		// TODO Auto-generated method stub

	}

}
