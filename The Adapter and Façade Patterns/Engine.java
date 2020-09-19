package Lab7;

public class Engine {
	String description;
/**
 * 
 * @param description
 */
	public Engine(String description) {
		this.description = description;
		// TODO Auto-generated constructor stub
	}
/**
 * 
 */
	public void start() {
		System.out.println("Engine is on");
		// TODO Auto-generated method stub

	}
/**
 * 
 */
	public void off() {
		System.out.println("Engine is off");
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return description;
	}

}
